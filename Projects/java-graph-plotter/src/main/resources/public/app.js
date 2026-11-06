// State Management
const state = {
    expressions: [
        { id: 1, expr: "x^2 - 3", color: "#e53e3e", visible: true, data: null, error: null },
        { id: 2, expr: "3 * sin(x)", color: "#3182ce", visible: true, data: null, error: null }
    ],
    viewport: {
        xMin: -10,
        xMax: 10,
        yMin: -6,
        yMax: 6
    },
    colors: [
        "#e53e3e", // Solid Red
        "#3182ce", // Solid Blue
        "#38a169", // Solid Green
        "#dd6b20", // Solid Orange
        "#805ad5", // Solid Purple
        "#319795", // Solid Teal
        "#d53f8c"  // Solid Pink
    ],
    colorIndex: 2,
    nextId: 3,
    isPanning: false,
    panStart: { x: 0, y: 0 },
    panViewportStart: null,
    mousePos: { x: 0, y: 0, onCanvas: false },
    debounceTimers: {}
};

// Canvas references
const canvas = document.getElementById("graph-canvas");
const ctx = canvas.getContext("2d");
const tooltip = document.getElementById("coord-tooltip");

// Viewport Input elements
const xminInput = document.getElementById("xmin-input");
const xmaxInput = document.getElementById("xmax-input");
const yminInput = document.getElementById("ymin-input");
const ymaxInput = document.getElementById("ymax-input");

// Initialization
window.addEventListener("DOMContentLoaded", () => {
    resizeCanvas();
    renderExpressionList();
    fetchAllExpressions();
    
    // Window Resize
    window.addEventListener("resize", () => {
        resizeCanvas();
        draw();
    });

    // Viewport Inputs changed manually
    const bindViewportInput = (inputEl, field) => {
        inputEl.addEventListener("change", () => {
            const val = parseFloat(inputEl.value);
            if (!isNaN(val)) {
                state.viewport[field] = val;
                fetchAllExpressions();
            }
        });
    };
    bindViewportInput(xminInput, "xMin");
    bindViewportInput(xmaxInput, "xMax");
    bindViewportInput(yminInput, "yMin");
    bindViewportInput(ymaxInput, "yMax");

    // Reset View Button
    document.getElementById("reset-view-btn").addEventListener("click", () => {
        state.viewport = { xMin: -10, xMax: 10, yMin: -6, yMax: 6 };
        updateViewportInputs();
        fetchAllExpressions();
    });

    // Add Expression Button
    document.getElementById("add-expr-btn").addEventListener("click", () => {
        addNewExpression();
    });

    // Zoom Buttons
    document.getElementById("zoom-in-btn").addEventListener("click", () => zoomAroundCenter(0.8));
    document.getElementById("zoom-out-btn").addEventListener("click", () => zoomAroundCenter(1.25));
    document.getElementById("pan-reset-btn").addEventListener("click", () => {
        const dx = (state.viewport.xMax - state.viewport.xMin) / 2;
        const dy = (state.viewport.yMax - state.viewport.yMin) / 2;
        state.viewport = { xMin: -dx, xMax: dx, yMin: -dy, yMax: dy };
        updateViewportInputs();
        fetchAllExpressions();
    });

    // Canvas Events for Pan & Zoom
    canvas.addEventListener("mousedown", handleMouseDown);
    canvas.addEventListener("mousemove", handleMouseMove);
    window.addEventListener("mouseup", handleMouseUp);
    canvas.addEventListener("wheel", handleWheel);
    canvas.addEventListener("mouseleave", () => {
        state.mousePos.onCanvas = false;
        tooltip.style.opacity = "0";
        draw();
    });
});

// Resize Canvas to fit container
function resizeCanvas() {
    canvas.width = canvas.parentElement.clientWidth;
    canvas.height = canvas.parentElement.clientHeight;
}

// Convert Math X to Screen Pixel X
function toScreenX(x) {
    const width = canvas.width;
    return ((x - state.viewport.xMin) / (state.viewport.xMax - state.viewport.xMin)) * width;
}

// Convert Math Y to Screen Pixel Y
function toScreenY(y) {
    const height = canvas.height;
    return height - ((y - state.viewport.yMin) / (state.viewport.yMax - state.viewport.yMin)) * height;
}

// Convert Screen Pixel X to Math X
function toMapX(px) {
    const width = canvas.width;
    return state.viewport.xMin + (px / width) * (state.viewport.xMax - state.viewport.xMin);
}

// Convert Screen Pixel Y to Math Y
function toMapY(py) {
    const height = canvas.height;
    return state.viewport.yMin + ((height - py) / height) * (state.viewport.yMax - state.viewport.yMin);
}

// Update Viewport Inputs to match current state
function updateViewportInputs() {
    xminInput.value = state.viewport.xMin.toFixed(2);
    xmaxInput.value = state.viewport.xMax.toFixed(2);
    yminInput.value = state.viewport.yMin.toFixed(2);
    ymaxInput.value = state.viewport.yMax.toFixed(2);
}

// Draw the Grid and Axes
function drawGrid() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);

    // Compute Nice grid sizes based on scale
    const targetSpacingPixels = 80;
    const rawStepX = targetSpacingPixels * (state.viewport.xMax - state.viewport.xMin) / canvas.width;
    const rawStepY = targetSpacingPixels * (state.viewport.yMax - state.viewport.yMin) / canvas.height;

    const stepX = getNiceGridStep(rawStepX);
    const stepY = getNiceGridStep(rawStepY);

    // Draw grid lines (clean light grey lines for light mode)
    ctx.strokeStyle = "rgba(0, 0, 0, 0.06)";
    ctx.lineWidth = 1;
    ctx.fillStyle = "#718096";
    ctx.font = "11px -apple-system, BlinkMacSystemFont, 'Segoe UI', sans-serif";

    // Screen coordinate of origin axes
    const originX = toScreenX(0);
    const originY = toScreenY(0);

    // Vertical grid lines
    const firstX = Math.floor(state.viewport.xMin / stepX) * stepX;
    const lastX = Math.ceil(state.viewport.xMax / stepX) * stepX;

    for (let x = firstX; x <= lastX; x += stepX) {
        if (Math.abs(x) < 1e-10) continue; // skip main axis
        const sx = toScreenX(x);
        ctx.beginPath();
        ctx.moveTo(sx, 0);
        ctx.lineTo(sx, canvas.height);
        ctx.stroke();

        // X Coordinate labels: pin to horizontal axis, or bottom of screen if offscreen
        let labelY = originY + 15;
        if (labelY < 15) labelY = 15;
        if (labelY > canvas.height - 10) labelY = canvas.height - 10;
        
        ctx.textAlign = "center";
        ctx.fillText(formatLabel(x), sx, labelY);
    }

    // Horizontal grid lines
    const firstY = Math.floor(state.viewport.yMin / stepY) * stepY;
    const lastY = Math.ceil(state.viewport.yMax / stepY) * stepY;

    for (let y = firstY; y <= lastY; y += stepY) {
        if (Math.abs(y) < 1e-10) continue; // skip main axis
        const sy = toScreenY(y);
        ctx.beginPath();
        ctx.moveTo(0, sy);
        ctx.lineTo(canvas.width, sy);
        ctx.stroke();

        // Y Coordinate labels: pin to vertical axis, or left of screen if offscreen
        let labelX = originX - 8;
        if (labelX < 35) {
            labelX = 35;
            ctx.textAlign = "left";
        } else if (labelX > canvas.width - 35) {
            labelX = canvas.width - 35;
            ctx.textAlign = "right";
        } else {
            ctx.textAlign = "right";
        }
        
        ctx.fillText(formatLabel(y), labelX, sy + 4);
    }

    // Draw main axes (X and Y) - solid visible grey lines
    ctx.strokeStyle = "rgba(0, 0, 0, 0.25)";
    ctx.lineWidth = 1.5;

    // X Axis
    if (originY >= 0 && originY <= canvas.height) {
        ctx.beginPath();
        ctx.moveTo(0, originY);
        ctx.lineTo(canvas.width, originY);
        ctx.stroke();
    }
    // Y Axis
    if (originX >= 0 && originX <= canvas.width) {
        ctx.beginPath();
        ctx.moveTo(originX, 0);
        ctx.lineTo(originX, canvas.height);
        ctx.stroke();
    }

    // Draw origin (0,0) label
    if (originX >= 0 && originX <= canvas.width && originY >= 0 && originY <= canvas.height) {
        ctx.textAlign = "right";
        ctx.fillText("0", originX - 8, originY + 15);
    }
}

// Compute nice grid intervals (e.g. 0.1, 0.2, 0.5, 1.0, 2.0, 5.0, 10.0...)
function getNiceGridStep(targetStep) {
    const exponent = Math.floor(Math.log10(targetStep));
    const fraction = targetStep / Math.pow(10, exponent);
    let niceFraction;
    if (fraction < 1.5) niceFraction = 1;
    else if (fraction < 3) niceFraction = 2;
    else if (fraction < 7) niceFraction = 5;
    else niceFraction = 10;
    return niceFraction * Math.pow(10, exponent);
}

// Format numbers for graph labels nicely
function formatLabel(num) {
    if (Math.abs(num) < 1e-10) return "0";
    // Avoid floating point inaccuracies
    const precision = num.toString().includes('.') ? 5 : 0;
    let s = parseFloat(num.toFixed(precision)).toString();
    return s;
}

// Draw all mathematical curves
function drawCurves() {
    state.expressions.forEach(item => {
        if (!item.visible || !item.data || item.error) return;

        ctx.strokeStyle = item.color;
        ctx.lineWidth = 2.5;
        ctx.lineJoin = "round";
        ctx.lineCap = "round";

        const xs = item.data.x;
        const ys = item.data.y;

        ctx.beginPath();
        let drawing = false;

        for (let i = 0; i < xs.length; ++i) {
            const y = ys[i];
            if (y === null || isNaN(y)) {
                drawing = false;
                continue;
            }

            const sx = toScreenX(xs[i]);
            const sy = toScreenY(y);

            // Prevent huge values from messing up drawing canvas coordinates
            if (Math.abs(sy) > 10000) {
                drawing = false;
                continue;
            }

            if (!drawing) {
                ctx.moveTo(sx, sy);
                drawing = true;
            } else {
                ctx.lineTo(sx, sy);
            }
        }
        ctx.stroke();
    });
}

// Draw inspection vertical line and intersection dots
function drawInspection() {
    if (!state.mousePos.onCanvas || state.isPanning) return;

    const mx = state.mousePos.x;
    const my = state.mousePos.y;
    const mapX = toMapX(mx);

    // Draw vertical inspection line
    ctx.strokeStyle = "rgba(0, 0, 0, 0.1)";
    ctx.lineWidth = 1;
    ctx.setLineDash([4, 4]);
    ctx.beginPath();
    ctx.moveTo(mx, 0);
    ctx.lineTo(mx, canvas.height);
    ctx.stroke();
    ctx.setLineDash([]); // reset

    let tooltipContent = [];
    tooltipContent.push(`<strong>x = ${mapX.toFixed(4)}</strong>`);

    state.expressions.forEach(item => {
        if (!item.visible || !item.data || item.error) return;

        // Find nearest point
        const xs = item.data.x;
        const ys = item.data.y;
        
        // Find index matching mouse coordinate
        let idx = -1;
        let minDist = Infinity;
        for (let i = 0; i < xs.length; i++) {
            const dist = Math.abs(xs[i] - mapX);
            if (dist < minDist) {
                minDist = dist;
                idx = i;
            }
        }

        if (idx !== -1 && ys[idx] !== null && !isNaN(ys[idx])) {
            const yVal = ys[idx];
            const sy = toScreenY(yVal);

            // Draw colored dot on intersection
            ctx.fillStyle = item.color;
            ctx.strokeStyle = "#ffffff";
            ctx.lineWidth = 1.5;
            ctx.beginPath();
            ctx.arc(mx, sy, 5, 0, Math.PI * 2);
            ctx.fill();
            ctx.stroke();

            tooltipContent.push(`<span style="color:${item.color}; font-weight: bold;">y = ${item.expr}</span>: ${yVal.toFixed(4)}`);
        }
    });

    // Update tooltip position & text
    if (tooltipContent.length > 1) {
        tooltip.innerHTML = tooltipContent.join("<br>");
        tooltip.style.opacity = "1";
        
        // Offset tooltip position
        let tx = mx + 15;
        let ty = my + 15;
        
        if (tx + tooltip.clientWidth > canvas.width) {
            tx = mx - tooltip.clientWidth - 15;
        }
        if (ty + tooltip.clientHeight > canvas.height) {
            ty = my - tooltip.clientHeight - 15;
        }

        tooltip.style.left = `${tx}px`;
        tooltip.style.top = `${ty}px`;
    } else {
        tooltip.style.opacity = "0";
    }
}

// Master Draw loop
function draw() {
    drawGrid();
    drawCurves();
    drawInspection();
}

// Fetch a single expression from the Java backend
async function fetchExpression(item) {
    if (!item.expr.trim()) {
        item.data = null;
        item.error = null;
        updateExpressionStatusUI(item);
        draw();
        return;
    }

    const steps = canvas.width || 800;
    const url = `/api/plot?expr=${encodeURIComponent(item.expr)}&min=${state.viewport.xMin}&max=${state.viewport.xMax}&steps=${steps}`;

    try {
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }
        const resData = await response.json();
        
        if (resData.status === "ok") {
            item.data = { x: resData.x, y: resData.y };
            item.error = null;
        } else {
            item.data = null;
            item.error = resData.message;
        }
    } catch (err) {
        item.data = null;
        item.error = "Failed to connect to parser server.";
    }

    updateExpressionStatusUI(item);
    draw();
}

// Fetch all visible/active expressions
function fetchAllExpressions() {
    state.expressions.forEach(item => {
        fetchExpression(item);
    });
}

// Add a new expression to state
function addNewExpression() {
    const color = state.colors[state.colorIndex];
    state.colorIndex = (state.colorIndex + 1) % state.colors.length;

    const newItem = {
        id: state.nextId++,
        expr: "",
        color: color,
        visible: true,
        data: null,
        error: null
    };

    state.expressions.push(newItem);
    renderExpressionList();
    
    // Focus the newly added input field
    setTimeout(() => {
        const field = document.querySelector(`.expression-item[data-id="${newItem.id}"] .expr-field`);
        if (field) field.focus();
    }, 50);
}

// Remove expression from state
function deleteExpression(id) {
    state.expressions = state.expressions.filter(item => item.id !== id);
    renderExpressionList();
    draw();
}

// Toggle expression visibility on graph
function toggleExpressionVisibility(id) {
    const item = state.expressions.find(x => x.id === id);
    if (item) {
        item.visible = !item.visible;
        const indicator = document.querySelector(`.expression-item[data-id="${id}"] .color-toggle`);
        if (indicator) {
            if (item.visible) {
                indicator.classList.remove("hidden");
                indicator.style.backgroundColor = item.color;
            } else {
                indicator.classList.add("hidden");
                indicator.style.backgroundColor = "transparent";
            }
        }
        draw();
    }
}

// Redraw / update the sidebar expression items UI
function renderExpressionList() {
    const listContainer = document.getElementById("expression-list");
    listContainer.innerHTML = "";

    state.expressions.forEach(item => {
        const itemDiv = document.createElement("div");
        itemDiv.className = `expression-item ${item.error ? 'has-error' : ''}`;
        itemDiv.setAttribute("data-id", item.id);

        itemDiv.innerHTML = `
            <div class="expression-main">
                <div class="color-toggle ${!item.visible ? 'hidden' : ''}" 
                     style="background-color: ${item.visible ? item.color : 'transparent'}; border-color: ${item.color}"
                     title="Toggle graph visibility"></div>
                <div class="expr-input-container">
                    <span class="expr-prefix">y =</span>
                    <input type="text" class="expr-field" placeholder="Enter function..." value="${item.expr}" spellcheck="false">
                </div>
                <button class="delete-expr-btn" title="Delete Expression">
                    <i class="fa-solid fa-trash-can"></i>
                </button>
            </div>
            <div class="error-container" style="display: ${item.error ? 'block' : 'none'}">
                <div class="error-msg">${item.error || ''}</div>
            </div>
        `;

        // Attach events
        const colorBtn = itemDiv.querySelector(".color-toggle");
        colorBtn.addEventListener("click", () => toggleExpressionVisibility(item.id));

        const inputField = itemDiv.querySelector(".expr-field");
        inputField.addEventListener("input", (e) => {
            const val = e.target.value;
            item.expr = val;

            // Debounce fetching backend
            if (state.debounceTimers[item.id]) {
                clearTimeout(state.debounceTimers[item.id]);
            }
            state.debounceTimers[item.id] = setTimeout(() => {
                fetchExpression(item);
            }, 300); // 300ms debounce
        });

        const deleteBtn = itemDiv.querySelector(".delete-expr-btn");
        deleteBtn.addEventListener("click", () => deleteExpression(item.id));

        listContainer.appendChild(itemDiv);
    });
}

// Update error box display dynamically for an expression
function updateExpressionStatusUI(item) {
    const itemDiv = document.querySelector(`.expression-item[data-id="${item.id}"]`);
    if (!itemDiv) return;

    const errorContainer = itemDiv.querySelector(".error-container");
    const errorMsg = itemDiv.querySelector(".error-msg");

    if (item.error) {
        itemDiv.classList.add("has-error");
        errorContainer.style.display = "block";
        errorMsg.textContent = item.error;
    } else {
        itemDiv.classList.remove("has-error");
        errorContainer.style.display = "none";
        errorMsg.textContent = "";
    }
}

// Panning and Mouse dragging logic
function handleMouseDown(e) {
    if (e.button !== 0) return; // Only left click pans
    state.isPanning = true;
    state.panStart.x = e.clientX;
    state.panStart.y = e.clientY;
    state.panViewportStart = { ...state.viewport };
    canvas.style.cursor = "grabbing";
    tooltip.style.opacity = "0";
}

function handleMouseMove(e) {
    const rect = canvas.getBoundingClientRect();
    state.mousePos.x = e.clientX - rect.left;
    state.mousePos.y = e.clientY - rect.top;
    state.mousePos.onCanvas = true;

    if (state.isPanning) {
        const dx = e.clientX - state.panStart.x;
        const dy = e.clientY - state.panStart.y;

        // Convert pixel delta to math coordinate delta
        const viewportWidth = state.panViewportStart.xMax - state.panViewportStart.xMin;
        const viewportHeight = state.panViewportStart.yMax - state.panViewportStart.yMin;

        const mapDx = (dx / canvas.width) * viewportWidth;
        const mapDy = (dy / canvas.height) * viewportHeight;

        // Update limits
        state.viewport.xMin = state.panViewportStart.xMin - mapDx;
        state.viewport.xMax = state.panViewportStart.xMax - mapDx;
        state.viewport.yMin = state.panViewportStart.yMin + mapDy; // reverse vertical axis
        state.viewport.yMax = state.panViewportStart.yMax + mapDy;

        updateViewportInputs();
        
        // Fetch values again as limits shift (debounce fetching server for smooth rendering)
        if (state.debounceTimers["global_pan"]) {
            clearTimeout(state.debounceTimers["global_pan"]);
        }
        state.debounceTimers["global_pan"] = setTimeout(() => {
            fetchAllExpressions();
        }, 50); // fast reload on dragging
        
        draw();
    } else {
        // Just inspect hover points
        draw();
    }
}

function handleMouseUp() {
    if (state.isPanning) {
        state.isPanning = false;
        canvas.style.cursor = "default";
        fetchAllExpressions(); // get final points
    }
}

// Zooming around cursor
function handleWheel(e) {
    e.preventDefault();
    const rect = canvas.getBoundingClientRect();
    const mx = e.clientX - rect.left;
    const my = e.clientY - rect.top;

    const mapX = toMapX(mx);
    const mapY = toMapY(my);

    // Zoom multiplier
    const zoomFactor = e.deltaY < 0 ? 0.9 : 1.1;

    // Apply zoom centered at cursor
    state.viewport.xMin = mapX + (state.viewport.xMin - mapX) * zoomFactor;
    state.viewport.xMax = mapX + (state.viewport.xMax - mapX) * zoomFactor;
    state.viewport.yMin = mapY + (state.viewport.yMin - mapY) * zoomFactor;
    state.viewport.yMax = mapY + (state.viewport.yMax - mapY) * zoomFactor;

    updateViewportInputs();

    // Reload coordinate data from the Java server
    if (state.debounceTimers["global_zoom"]) {
        clearTimeout(state.debounceTimers["global_zoom"]);
    }
    state.debounceTimers["global_zoom"] = setTimeout(() => {
        fetchAllExpressions();
    }, 100);

    draw();
}

function zoomAroundCenter(factor) {
    const cx = (state.viewport.xMin + state.viewport.xMax) / 2;
    const cy = (state.viewport.yMin + state.viewport.yMax) / 2;

    state.viewport.xMin = cx + (state.viewport.xMin - cx) * factor;
    state.viewport.xMax = cx + (state.viewport.xMax - cx) * factor;
    state.viewport.yMin = cy + (state.viewport.yMin - cy) * factor;
    state.viewport.yMax = cy + (state.viewport.yMax - cy) * factor;

    updateViewportInputs();
    fetchAllExpressions();
    draw();
}

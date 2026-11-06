# Java Graph Plotter

An interactive browser-based graph plotter with a Java 21 math-expression engine. It is a cross-platform Java conversion of the supplied C++/Winsock project: the interface and `GET /api/plot` contract are preserved, while the backend no longer requires Windows or a C++ compiler.

## Features

- Plot multiple expressions interactively in the browser.
- Pan, zoom, reset the viewport, and inspect coordinates.
- Parse and evaluate expressions using an abstract syntax tree (AST).
- Return gaps in a plotted curve for undefined values such as division by zero.
- Run on any system with Java 21 and Maven.

## Supported syntax

| Category | Supported values |
| --- | --- |
| Variable | `x` |
| Operators | `+`, `-`, `*`, `/`, `^` |
| Grouping | `( ... )` |
| Functions | `sin`, `cos`, `tan`, `log`, `exp`, `sqrt`, `abs` |
| Numbers | decimals such as `.5` and scientific notation such as `1e-3` |

Examples: `x^2 - 3`, `3 * sin(x)`, `sqrt(abs(x))`, `exp(-x^2)`.

## Run locally

1. Install Java 21 and Maven 3.9 or newer.
2. Open this folder in IntelliJ IDEA. IntelliJ detects `pom.xml` and imports the project automatically.
3. Run `GraphPlotterApplication`, or use:

```bash
mvn test
mvn package
java -jar target/graph-plotter-1.0.0.jar
```

4. Open `http://localhost:8080` in a browser. Use a different port with `java -jar target/graph-plotter-1.0.0.jar 9090`.

## API

`GET /api/plot?expr=<expression>&min=<minimum>&max=<maximum>&steps=<samples>`

Example:

```text
/api/plot?expr=x%5E2-3&min=-10&max=10&steps=500
```

Successful requests return JSON containing `status`, `expr`, `x`, and `y`. Non-finite values are encoded as `null`, allowing the browser to draw discontinuities. Invalid expressions return a JSON object with `status: "error"` and a readable message.

## Project structure

```text
src/main/java/com/intellgen/graphplotter/  Java application, HTTP server, lexer, parser, and AST
src/main/resources/public/                 Browser UI assets
src/test/java/com/intellgen/graphplotter/  Parser and HTTP integration tests
.github/workflows/ci.yml                   GitHub Actions test workflow
```

## Tests

The test suite verifies arithmetic precedence, right-associative powers, unary minus, mathematical functions, scientific notation, parser errors, undefined values, and the HTTP response format.

Run it with:

```bash
mvn test
```

## Publish to GitHub

Create an empty GitHub repository first, then run these commands from this project directory:

```bash
git init
git add .
git commit -m "Convert C++ graph plotter to Java"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/java-graph-plotter.git
git push -u origin main
```

The included GitHub Actions workflow runs the Maven tests on every push and pull request. This application is a local web server; publishing source code to GitHub does not deploy a public website. A separate hosting target would be needed for that.

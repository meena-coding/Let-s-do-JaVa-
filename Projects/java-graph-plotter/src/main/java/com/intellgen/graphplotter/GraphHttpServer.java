package com.intellgen.graphplotter;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;

public final class GraphHttpServer {
    private final HttpServer server;

    public GraphHttpServer(int port) throws IOException {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/api/plot", this::handlePlot);
        server.createContext("/", this::handleStaticFile);
        server.setExecutor(Executors.newCachedThreadPool());
    }

    public void start() { server.start(); }
    public void stop() { server.stop(0); }
    public int port() { return server.getAddress().getPort(); }

    private void handlePlot(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equals("GET")) {
            send(exchange, 400, "text/plain", "Only GET requests are supported.");
            return;
        }
        Map<String, String> parameters = queryParameters(exchange.getRequestURI().getRawQuery());
        String expression = parameters.getOrDefault("expr", "");
        if (expression.isBlank()) {
            send(exchange, 400, "application/json", "{\"status\":\"error\",\"message\":\"Expression is empty.\"}");
            return;
        }
        try {
            double min = parseDouble(parameters, "min", -10.0);
            double max = parseDouble(parameters, "max", 10.0);
            int steps = parseInt(parameters, "steps", 500);
            Expression parsed = ExpressionParser.parse(expression);
            send(exchange, 200, "application/json", plotJson(expression, parsed, min, max, steps));
        } catch (RuntimeException exception) {
            send(exchange, 200, "application/json", "{\"status\":\"error\",\"message\":\"" + escapeJson(exception.getMessage()) + "\"}");
        }
    }

    private void handleStaticFile(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equals("GET")) {
            send(exchange, 400, "text/plain", "Only GET requests are supported.");
            return;
        }
        String path = exchange.getRequestURI().getPath();
        String resource = path.equals("/") || path.equals("/index.html") ? "public/index.html" : "public" + path;
        if (path.contains("..")) {
            send(exchange, 404, "text/plain", "File Not Found");
            return;
        }
        try (InputStream stream = GraphHttpServer.class.getClassLoader().getResourceAsStream(resource)) {
            if (stream == null) {
                send(exchange, 404, "text/plain", "File Not Found: " + resource);
                return;
            }
            send(exchange, 200, contentType(resource), new String(stream.readAllBytes(), StandardCharsets.UTF_8));
        }
    }

    private static String plotJson(String expression, Expression parsed, double min, double max, int requestedSteps) {
        int steps = Math.max(requestedSteps, 1);
        double stepSize = (max - min) / steps;
        StringBuilder json = new StringBuilder("{\"status\":\"ok\",\"expr\":\"")
                .append(escapeJson(expression)).append("\",\"x\":[");
        for (int index = 0; index <= steps; index++) {
            if (index > 0) json.append(',');
            json.append(number(min + index * stepSize));
        }
        json.append("],\"y\":[");
        for (int index = 0; index <= steps; index++) {
            if (index > 0) json.append(',');
            double y = parsed.evaluate(min + index * stepSize);
            json.append(Double.isFinite(y) ? number(y) : "null");
        }
        return json.append("]}").toString();
    }

    private static Map<String, String> queryParameters(String rawQuery) {
        Map<String, String> parameters = new LinkedHashMap<>();
        if (rawQuery == null || rawQuery.isBlank()) return parameters;
        for (String part : rawQuery.split("&")) {
            int separator = part.indexOf('=');
            if (separator >= 0) parameters.put(part.substring(0, separator), URLDecoder.decode(part.substring(separator + 1), StandardCharsets.UTF_8));
        }
        return parameters;
    }

    private static double parseDouble(Map<String, String> parameters, String key, double fallback) { return parameters.containsKey(key) ? Double.parseDouble(parameters.get(key)) : fallback; }
    private static int parseInt(Map<String, String> parameters, String key, int fallback) { return parameters.containsKey(key) ? Integer.parseInt(parameters.get(key)) : fallback; }
    private static String number(double value) { return String.format(Locale.ROOT, "%.6f", value); }
    private static String escapeJson(String value) { return value == null ? "Unexpected error" : value.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r"); }
    private static String contentType(String resource) {
        if (resource.endsWith(".html")) return "text/html";
        if (resource.endsWith(".css")) return "text/css";
        if (resource.endsWith(".js")) return "application/javascript";
        if (resource.endsWith(".svg")) return "image/svg+xml";
        return "text/plain";
    }
    private static void send(HttpExchange exchange, int status, String type, String body) throws IOException {
        byte[] response = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", type + "; charset=utf-8");
        exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "*");
        exchange.sendResponseHeaders(status, response.length);
        try (var output = exchange.getResponseBody()) { output.write(response); }
    }
}

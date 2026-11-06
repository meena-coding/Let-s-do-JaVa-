package com.intellgen.graphplotter;

public final class GraphPlotterApplication {
    private GraphPlotterApplication() { }

    public static void main(String[] arguments) throws Exception {
        int port = arguments.length == 1 ? Integer.parseInt(arguments[0]) : 8080;
        GraphHttpServer server = new GraphHttpServer(port);
        server.start();
        System.out.printf("Java Graph Plotter running at http://localhost:%d%n", server.port());
        Thread.currentThread().join();
    }
}

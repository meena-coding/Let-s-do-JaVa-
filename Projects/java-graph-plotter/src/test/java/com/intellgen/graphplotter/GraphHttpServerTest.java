package com.intellgen.graphplotter;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GraphHttpServerTest {
    @Test void returnsPlotPointsAndNullForUndefinedValues() throws Exception {
        GraphHttpServer server = new GraphHttpServer(0);
        server.start();
        try {
            URI uri = new URI("http://localhost:" + server.port() + "/api/plot?expr=1%2Fx&min=-1&max=1&steps=2");
            HttpResponse<String> response = HttpClient.newHttpClient().send(HttpRequest.newBuilder(uri).GET().build(), HttpResponse.BodyHandlers.ofString());
            assertEquals(200, response.statusCode());
            assertTrue(response.body().contains("\"x\":[-1.000000,0.000000,1.000000]"));
            assertTrue(response.body().contains("\"y\":[-1.000000,null,1.000000]"));
        } finally {
            server.stop();
        }
    }
}

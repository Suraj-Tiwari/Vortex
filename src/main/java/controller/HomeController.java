package controller;

import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;


public class HomeController {
    public static void handleGet(RoutingContext routingContext) {
        HttpServerResponse response = routingContext.response();
        response.putHeader("content-type", "text/plain");
        response.end("Hello World from Vert.x /");
    }

    public static void handlePost(RoutingContext routingContext) {
        HttpServerResponse response = routingContext.response();
        response.putHeader("content-type", "text/plain");
        response.end("Hello World from Vert.x / :POST");
    }

}

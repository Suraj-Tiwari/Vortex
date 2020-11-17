import io.vertx.core.http.HttpServer;
import io.vertx.core.Vertx;
import routes.Routes;

public class Main {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        HttpServer server = vertx.createHttpServer();
        Routes router = new Routes(vertx);
        server.requestHandler(router.getRoutes());
        server.listen(8082, res -> {
            if (res.succeeded())
                System.out.println("Server started on port 8082");
            else
                System.out.println("Error starting server");
        });
    }
}

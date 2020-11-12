import io.vertx.core.http.HttpServer;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import routes.HomeRouter;

public class Main {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        HttpServer server = vertx.createHttpServer();
        Router router = Router.router(vertx);

        // register router here
        new HomeRouter(router);

        server.requestHandler(router);
        server.listen(8082);
    }
}

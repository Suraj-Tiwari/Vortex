package routes;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class Routes {
    Router router;

    public Routes(Vertx vertx) {
        router = Router.router(vertx);
    }

    /**
     * Configure all application routes here
     *
     * @return Router
     */
    public Router getRoutes() {
        new HomeRouter(router);
        return router;
    }
}

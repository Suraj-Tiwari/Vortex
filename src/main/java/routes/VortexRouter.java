package routes;

import io.vertx.core.Handler;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

import java.util.List;

abstract public class VortexRouter {
    public Router router;

    abstract public void setRoutes();

    public VortexRouter(Router router) {
        this.router = router;
        this.setRoutes();
    }

    public void registerGetRoute(String path, List<Handler<RoutingContext>> handlers) {
        for (Handler<RoutingContext> handler : handlers) {
            router.get(path).handler(handler);
        }
    }

    public void registerPostRoute(String path, List<Handler<RoutingContext>> handlers) {
        for (Handler<RoutingContext> handler : handlers) {
            router.post(path).handler(handler);
        }
    }

    public void registerPutRoute(String path, List<Handler<RoutingContext>> handlers) {
        for (Handler<RoutingContext> handler : handlers) {
            router.put(path).handler(handler);
        }
    }

    public void registerPatchRoute(String path, List<Handler<RoutingContext>> handlers) {
        for (Handler<RoutingContext> handler : handlers) {
            router.patch(path).handler(handler);
        }
    }

    public void registerDeleteRoute(String path, List<Handler<RoutingContext>> handlers) {
        for (Handler<RoutingContext> handler : handlers) {
            router.delete(path).handler(handler);
        }
    }

    public void registerOptionsRoute(String path, List<Handler<RoutingContext>> handlers) {
        for (Handler<RoutingContext> handler : handlers) {
            router.options(path).handler(handler);
        }
    }


}

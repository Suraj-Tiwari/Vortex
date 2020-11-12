package routes;

import controller.HomeController;
import io.vertx.ext.web.Router;
import middleware.Authorized;

import java.util.Arrays;

public class HomeRouter extends VortexRouter {

    public HomeRouter(Router router) {
        super(router);
    }

    @Override
    public void setRoutes() {
        ;
        this.registerGetRoute("/", Arrays.asList(
                Authorized::check,
                HomeController::handleGet
        ));

        this.registerPostRoute("/", Arrays.asList(
                Authorized::check,
                HomeController::handlePost
        ));
    }
}

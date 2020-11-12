package middleware;

import io.vertx.ext.web.RoutingContext;

public class Authorized {

    public static void check(RoutingContext routingContext) {
        /*
         * Here we can put required checks for jwt or any custom keu
         * if required header is not there it will be null
         */
        System.out.println(routingContext.request().getHeader("Authorization"));
        routingContext.next();
    }
}

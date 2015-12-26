package se.kd;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {
    public static void main(String... args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.sayHello());

        int port = getPort();
        port(port);
        staticFileLocation("/public");
        main();
        awaitInitialization();
    }

    // todo rename to something better
    private static void main() {
        get("/", (request, response) -> {
            Map<String, Object> map = new HashMap<>();
            return new ModelAndView(map, "main.mustache");
        }, new MustacheTemplateEngine());
    }

    private static int getPort() {
        String port = System.getProperty("port", "8080");
        return Integer.parseInt(port);
    }
}

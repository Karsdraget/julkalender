package se.kd;

import se.kd.internal.Hatch;
import se.kd.internal.HatchNumber;
import se.kd.internal.Hatches;
import se.kd.internal.InvalidHatchException;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {

    // todo Man ska inte kunna flytta en lucka efter att tiden har passerat i listan över alla luckor

    private static Hatches hatches = new Hatches();

    public static void main(String... args) {
        int port = getPort();
        port(port);

        staticFileLocation("/public");

        main();
        hatch();
        calendarAdmin();
        hatchAdmin();
        frontAdmin();

        awaitInitialization();
    }

    // todo rename to something better
    private static void main() {
        get("/", (request, response) -> {
            Map<String, Object> map = new HashMap<>();
            return new ModelAndView(map, "main.mustache");
        }, new MustacheTemplateEngine());
    }

    private static void hatch() {
        get("/lucka/:number", (request, response) -> {

            String hatchNumber = request.params(":number");

            Map<String, Object> map = new HashMap<>();

            // todo clean! This is way to large

            // todo check that we are not peeking ahead
            LocalDate currentDate = LocalDate.now(ZoneId.of("CET"));
            HatchNumber hatchNumber1;
            try {
                hatchNumber1 = new HatchNumber(hatchNumber);
            } catch (InvalidHatchException e) {
                return new ModelAndView(map, "stop_hatch.mustache");
            }

            Hatch hatch = hatches.getHatch(hatchNumber);

            map.put("hatch", hatch);

            return new ModelAndView(map, "hatch.mustache");
        }, new MustacheTemplateEngine());
    }

    private static void calendarAdmin() {
        get("/kalender-admin", (request, response) -> {
            Map<String, Object> map = new HashMap<>();
            map.put("hatches", hatches.getAll());

            return new ModelAndView(map, "calendar_admin.mustache");
        }, new MustacheTemplateEngine());
    }

    private static void hatchAdmin() {
        get("/luck-admin/:number", (request, response) -> {
            String hatchNumber = request.params(":number");

            Map<String, Object> map = new HashMap<>();

            Hatch hatch = hatches.getHatch(hatchNumber);

            map.put("hatch", hatch);

            return new ModelAndView(map, "hatch_admin.mustache");
        }, new MustacheTemplateEngine());
    }

    private static void frontAdmin() {
        get("/framsida-admin", (request, response) -> {
            Map<String, Object> map = new HashMap<>();
            return new ModelAndView(map, "front_admin.mustache");
        }, new MustacheTemplateEngine());
    }

    private static int getPort() {
        String port = System.getProperty("port", "8080");
        return Integer.parseInt(port);
    }
}

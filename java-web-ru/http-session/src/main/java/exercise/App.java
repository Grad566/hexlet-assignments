package exercise;

import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class App {

    private static final List<Map<String, String>> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        // BEGIN
        List<Map<String, String>> requiredUsers = new ArrayList<>();
        var users = Data.getUsers();
        app.get("/users", ctx -> {
            requiredUsers.clear();
            var page = ctx.queryParamAsClass("page", Integer.class).getOrDefault(1);
            var count = ctx.queryParamAsClass("per", Integer.class).getOrDefault(5);
            for (var i = (page - 1) * count; i < page * count; i++) {
                requiredUsers.add(users.get(i));
            }
            ctx.json(requiredUsers);
        });
        // END

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}

package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Zentasks will be here   ."));
    }

    public Result login() {
        return ok(

            login.render()
        );
    }
}

public class Login {

    public String email;
    public String password;

}

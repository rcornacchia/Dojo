package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {


    public static class Login {

        public String email;
        public String password;

    }

    public Result index() {
        return ok(index.render("Zentasks will be here   ."));
    }
    // 
    // public Result login() {
    //     return ok(
    //         login.render(form(Login.class))
    //     );
    // }
    // public Result authenticate() {
    //     login.render(form(Login.class));
    //     return ok();
    // }

}

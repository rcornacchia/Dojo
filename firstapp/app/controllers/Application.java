package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

     public Result index() {
         return ok(index.render());
     }

    public Result login() {
        return ok(
            login.render(form(Login.class))
        );
    }
<<<<<<< HEAD

=======
>>>>>>> 448f74b6d985b5c6f0a326d21b135059a7ae3950

public class Login {

    public String email;
    public String password;

}
<<<<<<< HEAD
}
=======
}
>>>>>>> 448f74b6d985b5c6f0a326d21b135059a7ae3950

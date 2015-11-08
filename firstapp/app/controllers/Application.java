package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {


     public Result index() {
         return ok(index.render());
     }

<<<<<<< HEAD
    public Result login() {
        return ok(
            login.render("Hello")
        );
    }

=======
>>>>>>> dd6c269eb8aa6d645183050dbbcb8eb820dd256a



}
<<<<<<< HEAD

}

=======
>>>>>>> dd6c269eb8aa6d645183050dbbcb8eb820dd256a

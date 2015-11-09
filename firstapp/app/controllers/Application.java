package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {


     public Result index() {
         return ok(index.render());
     }

<<<<<<< HEAD

=======
>>>>>>> 8defa5111bde081b14a25de8f18d98d2ee9d69e9
    public Result login() {
        return ok(
            login.render()
        );
    }

<<<<<<< HEAD



=======
>>>>>>> 8defa5111bde081b14a25de8f18d98d2ee9d69e9
}

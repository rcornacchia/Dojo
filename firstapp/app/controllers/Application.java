package controllers;

import play.*;
import play.mvc.*;
import java.sql.*;
import views.html.*;

public class Application extends Controller {


     public Result index() {
       
         
         return ok(index.render());
     }

    public Result login() {
        return ok(
            login.render()
        );
    }
}

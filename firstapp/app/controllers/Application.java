package controllers;

import play.*;
import play.mvc.*;
import java.sql.*;
import views.html.*;
import java.sql.*;


public class Application extends Controller {

   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://dojo.ckxewtmfwxoa.us-west-2.rds.amazonaws.com:3306/ase?user=dojo";
   static final String USER = "dojo";
   static final String PASS = "dojomaster";

     public Result index() {
           Connection conn = null;
           Statement stmt = null;
           try{
              //STEP 2: Register JDBC driver
              Class.forName("com.mysql.jdbc.Driver");
        
              //STEP 3: Open a connection
              System.out.println("Connecting to database...");
              conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
              //STEP 4: Execute a query
              System.out.println("Creating statement...");
              CallableStatement cs = conn.prepareCall("{call getArt()}");
            //   cs.registerOutParameter(1, Types.INTEGER);
            //   cs.registerOutParameter(2, Types.VARCHAR);
            //   cs.registerOutParameter(3, Types.INTEGER);
            //   cs.registerOutParameter(4, Types.VARCHAR);
              

              
              ResultSet rs = cs.executeQuery();
        
              //STEP 5: Extract data from result set
              while(rs.next()){
                 //Retrieve by column name
                 String uid  = rs.getString("username");
                 String path = rs.getString("filePath");
                 int votes = rs.getInt("votes");
                 String title = rs.getString("title");
                 //Display values
                 System.out.print("ID: " + uid);
                 System.out.print(", Age: " + path);
                 System.out.print(", Password: " + votes);
                 System.out.println(", email: " + title);
              }
              //STEP 6: Clean-up environment
              rs.close();
              conn.close();
           }catch(SQLException se){
              //Handle errors for JDBC
              se.printStackTrace();
           }catch(Exception e){
              //Handle errors for Class.forName
              e.printStackTrace();
           }finally{
              //finally block used to close resources
              try{
                 if(stmt!=null)
                    stmt.close();
              }catch(SQLException se2){
              }// nothing we can do
              try{
                 if(conn!=null)
                    conn.close();
              }catch(SQLException se){
                 se.printStackTrace();
              }//end finally try
           }//end try
           System.out.println("Goodbye!");

         
         return ok(index.render());
     }

    public Result login() {
        return ok(
            login.render()
        );
    }
}

/*
 * Gunti database project
 */
package guntiproject;

import java.sql.Connection;
import java.sql.DriverManager;


public class connectio {

    public static Connection cone()
     {
        Connection con=null;
       try
       {    
           Class.forName("oracle.jdbc.driver.OracleDriver");
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
       } catch(Exception e)
       {
           e.printStackTrace();
       }
       return con;
 
     }
}

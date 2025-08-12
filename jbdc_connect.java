import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jbdc_connect {
    Connection c;
    Statement s;
    jbdc_connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
  c= DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","samyakjainm31000");
    s=c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

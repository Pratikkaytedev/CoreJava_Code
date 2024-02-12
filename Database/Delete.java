package Database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete  {

    public static void main(String[] args) throws Exception{
        String name;
        String email;
        String password;
        String gender;
        String city;

        Class.forName("com.mysql.cj.jdbc.Driver");

       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","");

       PreparedStatement ps = con.prepareStatement("delete from register where email=?");
       ps.setString(1,"pratik@gmail.com");

       int i=ps.executeUpdate();
       if (i>0){
           System.out.println("deleted successfully");
       } else {
           System.out.println("failed");
       }
    }

}

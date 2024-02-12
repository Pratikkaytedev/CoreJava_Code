package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
    public static void main(String[] args) throws Exception {

        String name;
        String email;
        String password;
        String gender;
        String city;


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc", "root", "");

        PreparedStatement ps = con.prepareStatement("insert into register values (?,?,?,?,?)");

        ps.setString(1,"vansh");
        ps.setString(2,"vansh@gmail.com");
        ps.setString(3,"vansh@123");
        ps.setString(4,"male");
        ps.setString(5,"Dubai");

       int i= ps.executeUpdate();

       if (i>0){
           System.out.println("inserted successfull");
       } else {
           System.out.println("failed");
       }


    }


}

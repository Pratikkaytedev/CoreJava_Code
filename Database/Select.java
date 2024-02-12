package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

    public static void main(String[] args) throws Exception {

        String name;
        String email;
        String password;
        String gender;
        String city;

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","");

        PreparedStatement ps = con.prepareStatement("select * from register");

       ResultSet rs= ps.executeQuery();

       while (rs.next()){
         String name1=  rs.getString("name");
         String email1=  rs.getString("email");
         String password1=  rs.getString("password");
         String gender1=  rs.getString("gender");
         String city1 =rs.getString("city");

           System.out.println("name is "+ name1 + " email id is "+ email1+ " password is "+ password1+ " gender is "+ gender1+" and city name is "+ city1);
       }

    }


}

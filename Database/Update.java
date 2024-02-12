package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

    public static void main(String[] args) throws Exception {

        String name;
        String email;
        String password;
        String gender;
        String city;

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","");

        PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
        ps.setString(1,"Dubai");
        ps.setString(2,"girish@gmail.com");

        int i=ps.executeUpdate();

        if (i>0){
            System.out.println("successfully updated");
        } else {
            System.out.println("failed");
        }

    }

}

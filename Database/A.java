package Database;

import jdk.jfr.StackTrace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class A {

    public static void main(String[] args) throws Exception {

        String name;
        String email;
        String password;
        String gender;
        String city;

        try {
            //Load Class Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Eastablish Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc", "root", "");
            //Prepared Statement
            PreparedStatement pst = con.prepareStatement("Delete from register where city=?");

            pst.setString(1,"Dubai");

            int row = pst.executeUpdate();
            if (row>0){
                System.out.println("deleted");
            } else {
                System.out.println("failed");

            }


            /*ResultSet rs = pst.executeQuery();

            while (rs.next()){

                String name1 = rs.getString("name");
                String email1 = rs.getString("email");
                String password1 = rs.getString("password");
                String gender1 = rs.getString("gender");
                String city1 = rs.getString("City");

                System.out.println("name is" + name1);
                System.out.println("email is" + email1);
                System.out.println("password is" + password1);
                System.out.println("gender is" + gender1);
                System.out.println("city1 is" + city1);
                System.out.println("<br>_________________");
            }*/

            System.out.println("completed");

        }catch (Exception e){
            e.printStackTrace();
        }




    }
    }


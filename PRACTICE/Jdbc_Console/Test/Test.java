package PRACTICE.Jdbc_Console.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class Test {
    public static void main(String[] args) {
        getConnection();
    }

    public static Connection getConnection() {
        try {

            String driver = ("com.mysql.cj.jdbc.Driver");
            String databaseurl = "jdbc:mysql://localhost:3306/testjdbc";
            String username = "root";
            String password = "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseurl, username, password);
            System.out.println("database connected");
            return conn;

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}




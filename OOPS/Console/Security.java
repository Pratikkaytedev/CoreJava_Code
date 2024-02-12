package OOPS.Console;

import java.io.*;

public class Security {
    public static void main(String[] args) {
        String str; char ch[];
        Console obj = System.console();
        System.out.println("Enter user name: ");
        str= obj.readLine();
        System.out.println("Enter Password: ");
        ch = obj.readPassword();
        String a =String.valueOf(ch);

        System.out.println("username: "+ str);
        System.out.println("Password: "+ a);
    }
}

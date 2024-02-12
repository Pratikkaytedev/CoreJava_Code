package All_basics.Basics;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Check_Vovels_Console {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter the character");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o'){
            System.out.println("vovel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}

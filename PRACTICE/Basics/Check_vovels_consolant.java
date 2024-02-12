package PRACTICE.Basics;

import java.util.Scanner;

public class Check_vovels_consolant {
    public static void main(String[] args) {
        char a;
        System.out.println("enter any character");
        Scanner r=new Scanner(System.in);
        a=r.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println("thee input character is vovel");
        }
        else {
            System.out.println("Input character is consolant ");
        }
    }
}

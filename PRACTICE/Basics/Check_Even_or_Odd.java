package PRACTICE.Basics;

import java.util.Scanner;

public class Check_Even_or_Odd {
    public static void main(String[] args) {
        int num1;
        Scanner r= new Scanner(System.in);
        System.out.println("enter the number");
        num1 = r.nextInt();
        if (num1%2 == 0){
            System.out.println("entered number is odd");
        }
        else {
            System.out.println("entered number is even");
        }
    }
}

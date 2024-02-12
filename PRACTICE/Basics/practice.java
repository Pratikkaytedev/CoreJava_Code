package PRACTICE.Basics;

import java.util.Scanner;

// if the input number is Even/Odd then print all even numbers upto that number
public class practice {
    public static void main(String[] args) {
        int num1;
        Scanner r = new Scanner(System.in);
        System.out.println("enter the number");
        num1 = r.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("you entered the odd number");
            for (int i = 0; i <= num1; i = i + 2) {
                System.out.println(i+" ");
            }
            System.out.println("this is all odd numbers upto you input ");
        } else {
            System.out.println("you entered the Even number");
            for (int i = 1; i <= num1; i = i + 2) {
                System.out.print(i+" ");
            }
            System.out.println("this is all Even numbers upto you input ");
        }
    }

}

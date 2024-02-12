package All_basics.Basics;

import java.util.Scanner;

public class Add_two_numbers {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 =r.nextInt();
        int num2 =r.nextInt();
        System.out.println("The sum of two number is "+ (num1 + num2));
    }
}

package PRACTICE.Basics;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        int num1,sum=0;
        Scanner r=new Scanner(System.in);
        System.out.println("enter the number");
        num1= r.nextInt();
        while (num1>0){
            sum=num1%10;
            System.out.print(sum);
            num1=num1/10;
        }

    }
}

package PRACTICE.Average;

import java.util.Scanner;

public class Average {
    /*Print the average of three numbers entered by user by creating a class
        named 'Average'having a method to calculate and print the average.*/
    static void disp(){
        System.out.println("welcome ");
    }
    int num1, num2, num3, average;
    Scanner r = new Scanner(System.in);
    void method(){
        System.out.println("enter the three numbers");
        num1 = r.nextInt();
        num2 = r.nextInt();
        num3 = r.nextInt();
        System.out.println("The average of numbers is "+ (average= (num1+num2+num3)/3));
    }
}
class Main {
    public static void main(String[] args) {
        Average a=new Average();
        a.method();
    }
}

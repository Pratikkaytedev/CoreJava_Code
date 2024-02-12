package Practiceee;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int n=5;
        int sum=0;

        System.out.println(num1+" "+num2);
        while (n>0){
           sum=num1+num2;
           num1=num2;
           num2=sum;
           n--;
            System.out.println(sum);
        }
    }
}

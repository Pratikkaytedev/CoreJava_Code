package PRACTICE.Basics;

import java.util.Scanner;

public class Power_of_N {
    public static void main(String[] args) {
        int n;int p;int result=1;
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the number");
        n=r.nextInt();
        System.out.println("Enter the power");
        p=r.nextInt();
        for (int i=1;i<=p;i++){
            result=n    *result;
        }
        System.out.println("the power of N number is " +result);
    }
}

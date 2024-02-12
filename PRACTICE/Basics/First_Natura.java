package PRACTICE.Basics;

import java.util.Scanner;

public class First_Natura {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner r=new Scanner(System.in);
        System.out.println("enter the N number");
        n=r.nextInt();
        for (int i = 1; i <= n; i=i+2) {
            sum=sum+i;
        }
        System.out.println(sum);

    }
}

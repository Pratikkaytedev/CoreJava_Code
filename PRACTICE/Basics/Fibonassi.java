package PRACTICE.Basics;

import java.util.Scanner;

public class Fibonassi {
    public static void main(String[] args) {
        int a=0; int b=1; int n; int c;
        Scanner r = new Scanner( System.in);
        System.out.println("enter any numbers");
        n= r.nextInt();
        System.out.println(a + " "+ b);
        for (int i =2; i <n ; i++) {
          c=b+a;
            System.out.println(c);
         a=b;
         b=c;
        }

    }
}

package All_basics.Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0; int b=1; int c;
        int term;
        Scanner r=new Scanner(System.in);
        term =r.nextInt();
        for (int i = 1; i <=term; i++) {
            System.out.println(a);
          c=a+b;
          a=b;
          b=c;
        }
    }
}

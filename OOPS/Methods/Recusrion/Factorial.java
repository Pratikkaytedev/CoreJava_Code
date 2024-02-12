package OOPS.Methods.Recusrion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner r=new Scanner(System.in);
        System.out.println("enter any number");
        n = r.nextInt();
        Factorial f=new Factorial();
        int result = f.fact(n);
        System.out.println("factorial of given number" +result);
    }
    int fact (int n){
        if (n == 1)
            return 1;
        else
            return n*fact(n-1);
    }
}

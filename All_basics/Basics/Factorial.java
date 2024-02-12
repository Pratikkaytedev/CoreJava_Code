package All_basics.Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num, temp=1;
        Scanner r=new Scanner(System.in);
        System.out.println("enter the number");
        num = r.nextInt();
        for (int i = num; i >0 ; i--) {
            temp = temp*i;
        }
        System.out.println("The factorial of " + num + " is " + temp);
    }
}

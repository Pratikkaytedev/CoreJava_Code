package All_basics.Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,r,sum=0,temp;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        n = scan.nextInt();
        temp=n;
        while (n>0){
            r= n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum){
            System.out.println(temp +"The entered number is palindrome");
        }
        else {
            System.out.println(temp +"Not palindrome");
        }
    }
}

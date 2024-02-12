package All_basics.Basics;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num ; int rem;
        Scanner r=new Scanner(System.in);
        System.out.println("enter a number");
        num = r.nextInt();
        while (num>0){
            rem=num%10;
            System.out.print(rem);
            num=num/10;
        }
    }
}

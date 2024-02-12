package All_basics.Basics;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter the number");
        int num =r.nextInt();
        if (num%2 == 1){
                System.out.println("the number is even");
            }
        else {
            System.out.println("the number is odd");
        }
    }
}

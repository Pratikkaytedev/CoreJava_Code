package All_basics.Basics;

import java.util.Scanner;

public class Power_number {
    public static void main(String[] args) {
        int num,power,result=1;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the number");
        num = r.nextInt();
        System.out.println("Enter the power");
        power = r.nextInt();
        for (int i = 0; i <power ; i++) {
            result = result*num;
        }
        System.out.println("The power of a number is " +result);
    }
}

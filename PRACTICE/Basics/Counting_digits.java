package PRACTICE.Basics;

import java.util.Scanner;

public class Counting_digits {
    public static void main(String[] args) {
        int num;
        int count = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("enter the number");
        num = r.nextInt();
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("the number oof digits in a number " + count);

    }
}

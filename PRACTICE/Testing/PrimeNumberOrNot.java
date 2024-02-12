package PRACTICE.Testing;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int num = scanner.nextInt();

        if (num%2==0){
            System.out.println("given number is prime number");
        }
        else {
            System.out.println("given number is even number");
        }

    }
}

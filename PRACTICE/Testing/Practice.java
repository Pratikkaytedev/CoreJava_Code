package PRACTICE.Testing;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        String name;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.println("Enter your age");
        age = scanner.nextInt();

        System.out.println("Welcome "+ name + " your age is "+ age);

        int year = 2023-age;
        System.out.println("you birth year is "+ year );

        if (age>=18){
            System.out.println("You are eligible for voting");
        }
        else {
            System.out.println("You are not eligible for voting");
        }
    }
}

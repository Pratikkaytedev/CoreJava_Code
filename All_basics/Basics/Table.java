package All_basics.Basics;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {

        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number you want to print a table");
        num1=scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 +" * "+ i +" = " + num1*i);
        }


    }

}

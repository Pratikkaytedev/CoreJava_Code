package PRACTICE.Basics;

import java.util.Scanner;

public class Even_number {
    public static void main(String[] args) {
        int n;
        Scanner r= new Scanner(System.in);
        System.out.println("enter the number upto you want to print");
        n= r.nextInt();
        System.out.println("the Prime numbers is");
        for (int i = 1; i <n ; i=i+2) {
            System.out.println(i);
        }
    }
}

package All_basics.Basics;

import java.util.Scanner;

public class Addition_even_no {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n;
            int sum = 0;
            System.out.println("Enter the N number:");
            n = scan.nextInt();
            for (int i = 1; i < n; i=i+2) {
                System.out.println(i);
                sum=i+sum;
            }
            System.out.println("addition of given number is "+sum);
        }
    }

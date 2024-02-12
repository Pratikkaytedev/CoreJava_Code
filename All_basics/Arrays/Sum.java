package All_basics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = scan.nextInt();
        int a[] = new int[size];
        int sum = 0;
        int average;

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(a));

        for (int s : a) {
            sum = sum + s;

        }
        System.out.println("the sum is " + sum);
        average = sum/a.length;
        System.out.println("The average is "+ average);

    }
}

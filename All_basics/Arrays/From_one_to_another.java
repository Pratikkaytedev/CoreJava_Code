package All_basics.Arrays;

import java.util.Scanner;

public class From_one_to_another {
    public static void main(String[] args) {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the n number");
        n = r.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("enter value in first array");
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt();
        }
        System.out.println("the array is");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("second array is");
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
            System.out.println(b[i]);
        }
    }
}

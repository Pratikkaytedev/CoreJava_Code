package All_basics.Arrays;

import java.util.Scanner;

public class Input_array {
    public static void main(String[] args) {
        int n;
        Scanner r= new Scanner(System.in);
        System.out.println("enter the N number");
        n=r.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n; i++) {
            a[i]= r.nextInt();
        }
        for (int i = 0; i <n; i++) {
            System.out.println(a[i]);
        }
    }
}

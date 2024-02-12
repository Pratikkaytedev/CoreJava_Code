package All_basics.Basics;

import java.util.Scanner;

public class sum_N_number {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter the number");
        int num = r.nextInt();
        int sum=0;
        for (int i = 0; i <num ; i++) {
            sum = sum+i;
        }
        System.out.println("The sum of first natural number is " + sum);
    }
}

package All_basics.Basics;

import java.util.Scanner;

public class Sum_Odd_Even_no {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner r= new Scanner(System.in);
        System.out.println("enter the n numbers ");
        n = r.nextInt();
        if (n%2==0){
            for (int i = 0; i <=n ;i = i+2) {
                sum= sum+i;
            }
            System.out.println(sum);
        }
        else {
            for (int i = 1; i <=n; i=i+2) {
              sum= sum+i;
            }
            System.out.println(sum);
        }
    }
}

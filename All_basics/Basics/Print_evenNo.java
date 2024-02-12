package All_basics.Basics;

import java.util.Scanner;

public class Print_evenNo {
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = r.nextInt();
        int sum = 0;
        for (int i = 0; i <num ; i=i+2) {
           sum = sum+i;
            System.out.print(i +" ");
        }
        System.out.println("The sum of all even number is " +sum);
    }
}

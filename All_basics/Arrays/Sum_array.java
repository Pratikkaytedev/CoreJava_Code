package All_basics.Arrays;

import java.util.Scanner;

public class Sum_array {
    public static void main(String[] args) {
        int size;
        int sum=0;
        Scanner r=new Scanner(System.in);
        System.out.println("enter the size of array");
        size= r.nextInt();
        int a[]= new int [size];

        for (int i = 0; i <a.length ; i++) {
             a[i]=r.nextInt();
        }
        System.out.println("enter array is");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i <a.length; i++) {
             sum=a[i]+sum;
        }
        System.out.println("sum of array is "+ sum );
        int average= sum/size;
        System.out.println("the average of array is "+average);
    }
}

package All_basics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    //    {34,67,89,90,97,45,66,43}
    public static void main(String[] args) {

        int a[] = {34, 67, 89, 90, 97, 45, 66, 43};
        Arrays.sort(a);

        System.out.println("ascending sorting ");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("descending sorting ");
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]+" ");
        }

        System.out.println();
        //largest element
        System.out.println("Largest element is "+a[a.length-1]);

        //second largest element
        System.out.println("second largest element is "+ a[a.length - 2]);

        //smallest element is
        System.out.println("smallest element is " + a[0]);
    }
}


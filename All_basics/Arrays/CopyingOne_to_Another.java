package All_basics.Arrays;

import java.util.Arrays;

public class CopyingOne_to_Another {

    public static void main(String[] args) {

        int array1[] = new int[]{2, 4, 6, 8};
        int array2[] = new int[array1.length];
 
        //copying array1 to array2
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        //printing the array1
        System.out.println("first array");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        //printing the array2
        System.out.println("second array");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}



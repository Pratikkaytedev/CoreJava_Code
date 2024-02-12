package All_basics.Arrays;

import java.util.Arrays;

public class Min_Max {
    public static void main(String[] args) {
        int a []= {10,20,30,49,59,};


        Arrays.sort(a);
        System.out.println(Arrays.stream(a).min());
        System.out.println(Arrays.stream(a).max());
    }
}

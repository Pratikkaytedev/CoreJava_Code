package All_basics.Strings;

import java.util.Arrays;

public class ToString_AsList_Deep_to {
    public static void main(String[] args) {
        String a[] = {"Pratik, Dilip, Kayte"};
        System.out.println("toString" + Arrays.toString(a));
        System.out.println("toString" + Arrays.asList(a));
        int b[][]={{19,29},{30,40}};
        System.out.println("toString" + Arrays.deepToString(b));
    }
}
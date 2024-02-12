package All_basics.Loop.For_each;

public class For_each {
    public static void main(String[] args) {
        int a [] = {10,20,30,40,50,60};
        for (int b: a) {
            System.out.println(b);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

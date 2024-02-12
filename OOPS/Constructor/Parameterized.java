package OOPS.Constructor;

public class Parameterized {
    int a;
    String b;

    Parameterized(int a, String b) {
        System.out.println(a + " " + b);
    }
}

class Mains {
    public static void main(String[] args) {
        Parameterized r = new Parameterized(2, "Pratik");
    }
}

package OOPS.Methods.Overloading;

public class Adder {
    int two(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}

class Second extends Adder {
    int two(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        Second s = new Second();
        s.two(10, 12);

    }
}

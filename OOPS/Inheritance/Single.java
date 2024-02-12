package OOPS.Inheritance;

public class Single {
    int a;
    String b;

    public void input() {
        a = 10;
        b = "Pratik";
        System.out.println("Parent class");
    }
}

class B extends Single {
    public void input() {
        super.input();
        System.out.println("child class");
    }

    public void output() {
        System.out.println("child class" +a + " " + b);
    }

    public static void main(String[] args) {
        B r = new B();
        r.input();
        r.output();
    }
}

package OOPS.Methods;

import java.util.Scanner;

public class Use_methods {
    int num1, num2, add, sub, multi, div;
    Scanner r = new Scanner(System.in);

    public static void main(String[] args) {
        Use_methods a = new Use_methods();
        a.input();
        a.process();
        a.output();
    }

    void input() {

        System.out.println("enter two numbers");
        num1 = r.nextInt();
        num2 = r.nextInt();
    }

    void process() {
        add = num1 + num2;
        sub = num1 + num2;
        multi = num1 + num2;
        div = num1 + num2;
    }

    void output() {
        System.out.println("addition is " + add);
        System.out.println("addition is " + sub);
        System.out.println("addition is " + multi);
        System.out.println("addition is " + div);
    }
}


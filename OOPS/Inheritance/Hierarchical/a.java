package OOPS.Inheritance.Hierarchical;

import java.util.Scanner;

public class a {
    void input (){
        System.out.println("enter your name");
    }
}
class B extends a{
    void show (){
        System.out.println("my name is Pratik");
    }
}
class C extends a {
    void show (){
        System.out.println("my name is Mayu");
    }
}
class Main {
    public static void main(String[] args) {
        B b=new B();
        C c=new C();
        b.input(); b.show();
        c.input(); c.show();
    }
}

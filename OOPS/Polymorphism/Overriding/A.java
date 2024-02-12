package OOPS.Polymorphism.Overriding;

public class A {
    void shape (){
        System.out.println("describe the shape");
    }
}
class B extends A {
@Override
    void shape() {
    super.shape();

        System.out.println("the shape is traingle");
    }
}
class Main {
    public static void main(String[] args) {
        B b = new B();
        b.shape();

    }
}

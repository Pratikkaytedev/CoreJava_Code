package PRACTICE.Methods.Using_of.Overloading;

public class calculation {
    void input (int a, int b){
        System.out.println(a+b+"first");
    }
    void input (double a, int c){
        System.out.println(a+c+"second");
    }
}
class Main {
    public static void main(String[] args) {
        calculation c= new calculation();
        c.input(19,30);
        System.out.println("all codes executed properly");
    }
}

package OOPS.Constructor;

public class Default {
    int a; String b;
    Default (){
        a = 5; b = "pratik";
    }
    void show (){
        System.out.println(a + " " + b);
    }
}
class Main {
    public static void main(String[] args) {
        Default d=new Default();
        d.show();
    }
}

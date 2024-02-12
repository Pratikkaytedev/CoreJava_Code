package PRACTICE.Leet_code.Inheritance;

abstract public class Animals {
    public void walk (){
        System.out.println(" I am walking");
    }
}
class Birds extends Animals {
    public void fly(){
        System.out.println("I am flying");
    }
    public void sing (){
        System.out.println("I am singing");
    }
}
class Manthan {
    public static void main(String[] args) {
        Birds b= new Birds();
        b.walk();
        b.sing();
        b.fly();
    }
}

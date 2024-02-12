package OOPS.Methods.Overriding;

public class Vehicle {
    void run(){
        System.out.println("all vehices running ");
    }
}
class Bike extends Vehicle {
    void run (){
        super.run();
        System.out.println("Bike running safely");
    }
}
class main {
    public static void main(String[] args) {
        Bike b= new Bike();
        b.run();
    }
}
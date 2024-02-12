package OOPS.Inheritance1.Animal;

public class Animal {
    void walk(){
        System.out.println("I am walking animal");
    }
}
class Birds extends Animal {
    void walk(){
        System.out.println("I am Fly birds");
    }

    void sing(){
        System.out.println("I am singing birds");
    }
}
class Peageon extends Birds {

    @Override
    void sing() {
        System.out.println("I am cryinng peageon");
    }
    void fight(){
        System.out.println("I am fighting peageon");
    }
}
class Main
{
    public static void main(String[] args) {
        Peageon a= new Peageon();
        a.walk();
        a.sing();
        a.fight();

    }
}


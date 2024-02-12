package OOPS.Inheritance1.Test;

public class Employe {
    float sal=40000;
}
class Child extends Employe{
    float bonus=10000;
}
class Total extends Child{
    void total() {
        System.out.println("Total salary of Employee is "+ (bonus+sal));
    }
}
class Main {
    public static void main(String[] args) {
        Total c=new Total();
        c.total();
    }
}

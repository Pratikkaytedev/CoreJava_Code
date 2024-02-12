package Hs_Group_Classes.Oops.Inheritance.Heirarchical.Area;



public class Symbol {
    double length, breath;

    Symbol(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double area() {
        System.out.printf("inside sumbol main class");
        return length * breath;
    }
}

class Rectangle extends Symbol {


    Rectangle(double length, double breath) {
        super(length, breath);
    }

    @Override
    public double area() {
        System.out.printf("inside Rectangle");
        return length * breath;
    }
}

class Triangle extends Symbol{
    double height;

    Triangle (double length, double breath, double height){
        super(length,breath);
        this.height=height;
    }

    @Override
    public double area() {
        System.out.printf("inside triangle");
        return length*breath*height;
    }
}
class Square extends Symbol{


    Square (double length, double breath){
        super(length,breath);

    }

    @Override
    public double area() {
        System.out.printf("inside symbol");
        return length*breath;
    }
}

class Main{
    public static void main(String[] args) {

        Rectangle r=new Rectangle(6,6);
        Symbol s1= new Rectangle(2,3);
        System.out.println("Symbol"+ s1.area());

        System.out.println("Rectangle"+ r.area());

        Triangle t=new Triangle(2,2,2);
        System.out.println("Triangle"+t.area());

        Square s=new Square(3,3);

        System.out.println("square"+ s.area());

    }

}
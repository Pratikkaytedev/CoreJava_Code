package PRACTICE.Practice_code.Inheritance;

public class Shape {
    public double calculateArea(){
        return 0;
    }
}
class Rectangle extends  Shape {

    private double length,breath;
   public Rectangle (double length,double breath){
       this.length=length;
       this.breath=breath;
   }

    @Override
    public double calculateArea() {
        return length*breath;
    }
}

class Triangle extends  Shape {
    private  double length,breath,height;

    public Triangle(double length,double breath, double height){
        this.length=length;
        this.breath=breath;
        this.height=height;
    }
    @Override
    public double calculateArea(){
        return length*breath*height;
    }
}
class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,4);
       double rec= rectangle.calculateArea();
        System.out.println("area of rectangle is "+ rec);

        Triangle triangle = new Triangle(2,4,6);
       double tri= triangle.calculateArea();
        System.out.println("area of Triangle is "+ tri);
    }
}

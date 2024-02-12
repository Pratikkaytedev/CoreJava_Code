package OOPS.Abstraction.Area;

public abstract class Area {

    abstract void area(int length , int breath);
}
 class Rectangle extends Area{

    @Override
    void area(int length, int breath) {
        System.out.println("area of rectangle is "+ length * breath);
    }
}
 class Triangle extends Area{

    int height =30;

    void area(int length, int breath ) {

        System.out.println("area of triangle is "+ length * breath * height);

    }

 }

 class Main{

     public static void main(String[] args) {

         Area r = new Rectangle();
         Area t = new Triangle();
         r.area(10,20);
         t.area(20,20);



     }
 }

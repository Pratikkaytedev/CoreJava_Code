package All_basics.Constructor;

public class Triangle {
  /*  Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5units
    by creating a class named 'Triangle' without any parameter in its constructor.*/

    int length, breath, height;

    Triangle(int length, int breath, int height) {
        System.out.println("area of triangle " + (length * breath * height));
    }

    public void area() {
        System.out.println("area of triangle is " + (length * breath * height));
    }
}

class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        t.area();
    }
}

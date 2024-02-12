package OOPS.Constructor;

public class Constructor_Overloading {
    int a, b; String c;
    Constructor_Overloading (){
        a = 1;b=2;c="first";
    }
    Constructor_Overloading (int a){
       a= 12;
    }
    Constructor_Overloading (int b, String c){
       a=22;c="third" ;
    }
}
class Maain {
    public static void main(String[] args) {
        Constructor_Overloading a = new Constructor_Overloading();
        Constructor_Overloading b = new Constructor_Overloading(10);
        Constructor_Overloading c = new Constructor_Overloading(20,"Pratik");
        System.out.println(a.a + a.c + a.b);
        System.out.println(b.a);
        System.out.println(c.a+ c.c);
    }
}

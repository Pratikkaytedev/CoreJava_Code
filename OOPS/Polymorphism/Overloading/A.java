package OOPS.Polymorphism.Overloading;

public class A {
    void add(int c){

        System.out.println(c);
    }
    void add (int d, String e){

        System.out.println(d+e);
    }
    void add (String f, String g){
        f= "Kayte"; g = "Dilip";
        System.out.println(f+g);
    }
}
class main {
    public static void main(String[] args) {
        A r=new A();
        r.add(5);
        r.add(2,"a");
        r.add("b","c");
    }
}

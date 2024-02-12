package OOPS.Inheritance;

public class Multi_level {
    int a; int b; int c;
    void input (){
        a = 10; b=20;
    }
}
class Ba extends Multi_level{
    void process (){
        c= a+b;
    }
}
class C extends  Ba{
    void output (){
        System.out.println( c);
    }
}
class Main {
    public static void main(String[] args) {
       C ref = new C();
       ref.input();
       ref.process();
       ref.output();
    }
}

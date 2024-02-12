package OOPS.Abstraction.Abstract_method;

abstract class Programing {
    public abstract void Developer();
}
class Java extends Programing {
    public void Developer (){
        System.out.println("james gosling");
    }
}
class C extends Programing {
    public void Developer (){
        System.out.println("dont know");
    }
}
class Python extends Programing {
    public void Developer (){
        System.out.println("james");
    }
}
 class Main {
    public static void main(String[] args) {
        Programing p= new Python();
        Programing j = new Java();
        C c = new C();
        p.Developer();
        j.Developer();
        c.Developer();


    }
}
package OOPS.Constructor;

public class Copy {
    int a=5; String b= "Pratik";
    Copy (){
        System.out.println(a + " "+ b);
    }
    Copy (Copy ref){
        System.out.println(a + " "+b);
    }
}
class Mai {
    public static void main(String[] args) {
        Copy ref=new Copy();
        Copy c1= new Copy(ref);
    }
}

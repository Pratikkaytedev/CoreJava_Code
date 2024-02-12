package PRACTICE.Methods.Using_of;

import java.util.Scanner;

public class Program {
    int a ,b,c;
    public   void input()
    {

        System.out.println("enter two numbers");
        Scanner r=new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
    }
}
class Addition extends Program {

        public void sum (){
        c= a+b;
        }
}
class  Display extends Addition {
    public void show (){
        System.out.println("The addition of two number is "+ c);
    }
}
class Main {
    public static void main(String[] args) {
        Display d= new Display();
        d.input();
        d.sum();
        d.show();
        System.out.println("everthing is working fine");
    }
}
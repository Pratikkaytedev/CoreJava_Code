package OOPS.Interface.Client;

import java.util.Scanner;

public interface Client {
  public   void input ();
  public   void output ();

}
class Pratik implements Client{
    String Useername; int Salary;
    @Override
    public void input (){
        Scanner r= new Scanner(System.in);
        System.out.println("Enter username");
        Useername = r.nextLine();
        System.out.println("Enter Salary");
        Salary = r.nextInt();
    }

    @Override
    public void output() {
        System.out.println("the sum of two number is " + Useername +" "+ Salary);
    }
}
class Main {
    public static void main(String[] args) {
        Client c= new Pratik();
        c.input();
        c.output();
    }
}

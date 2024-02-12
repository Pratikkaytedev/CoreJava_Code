package OOPS.Inheritance1.Integer;

class Arithmetic {
   /* A class named Arithmetic with a method named add that takes  integers as parameters and returns
            an integer denoting their sum.
    A class named Adder that inherits from a superclass named Arithmetic. Your classes should not be be .*/
    int add (int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
}
class Adder extends Arithmetic{
    public int callAdd(int num1,int num2){
        return add(num1,num2);
    }
}
class Main{
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is "+ a.getClass().getSuperclass().getName());
    }
}

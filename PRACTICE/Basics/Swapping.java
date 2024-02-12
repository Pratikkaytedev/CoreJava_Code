package PRACTICE.Basics;

public class Swapping {
    public static void main(String[] args) {
        int a=5,b=7;
        System.out.println("before swapping number is "+a+" "+b);

        /*Logic 1:- Using Third Variable.
        int temp=0;
        temp=a;
        a=b;
        b=temp;*/

        /*Logic 2:- (add and sub) without using third variable.
        a=a+b;
        b=a-b;
        a=a-b;*/

        /*Logic 3:- (multi and div ) without using third variable.
         here a & b values should not be zero
        a=a*b;
        b=a/b;
        a=a/b;*/


        System.out.println("After swapping number is "+a+" "+b);
    }
}

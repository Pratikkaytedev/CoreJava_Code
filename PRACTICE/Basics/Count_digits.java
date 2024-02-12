package PRACTICE.Basics;

import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        int num1,num2,result,operator;
        System.out.println("enter two number ");
        Scanner r=new Scanner(System.in);
        num1=r.nextInt();
        num2=r.nextInt();
        System.out.println("select 1=add, 2=sub, 3=mul, 4=div");
        operator=r.nextInt();
        switch (operator){
            case 1  : result=num1+num2;
                System.out.println("you select the addition operator "+ result);
                break;
            case 2 : result=num2-num1;
                System.out.println("you select the subtraction operator"+ result);
        }

    }
}

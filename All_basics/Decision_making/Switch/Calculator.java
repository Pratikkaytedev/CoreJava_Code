package All_basics.Decision_making.Switch;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            int num1; int num2; int operator;
            Scanner r=new Scanner(System.in);
            System.out.println("Enter two numbers");
            num1 =r.nextInt();
            num2 =r.nextInt();
            System.out.println("Enter the Operator 1 = + , 2 = - , 3 = / , 4 = * , 5 = %");
            operator = r.nextInt();
          switch (operator)
          {
              case 1 :
                  System.out.println("you want to add " +(num1 + num2));
                  break;
              case 2 :
                  System.out.println("you want to sub " + (num1 - num2));
                  break;
              case 3 :
                  System.out.println("you want to mul " + (num1 * num2));
                  break;
              case 4 :
                  System.out.println("you want to div " + (num1 / num2));
                  break;
              case 5 :
                  System.out.println("you want to rem " + (num1 % num2));
                  break;
              default:
                  System.out.println("invalid choice");
          }
            System.out.println("out of switch");
        }
}

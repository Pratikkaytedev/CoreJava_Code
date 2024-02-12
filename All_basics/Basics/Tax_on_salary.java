package All_basics.Basics;

import java.util.Scanner;

public class Tax_on_salary {
    public static void main(String[] args) {
        int sal,tax;
        Scanner r=new Scanner(System.in);
        System.out.println("enter you salary");
        sal = r.nextInt();
        if (sal>=1000 && sal <=2000){
            System.out.println("you are getting 10% tax " + (tax = sal/10));
        } else if (sal>2000 && sal<=3000) {
            System.out.println("you are getting 20% tax " + (tax = sal/20));
        } else if (sal>3000 && sal<=4000) {
            System.out.println("you are getting 30% tax " + (tax = sal/30));
        } else if (sal>4000 && sal<=5000) {
            System.out.println("you are getting 40% tax " + (tax = sal/40));
        }
        else {
            System.out.println("you entered the wrong salary");
        }
    }

}

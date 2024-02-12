package All_basics.Decision_making.Conditional.If_else_if_ladder;

import java.util.Scanner;

public class If_else_if {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("enter he number ");
        int num = r.nextInt();

        if (num>18 && num<25){
            System.out.println("you are teenager");
        } else if (num>26 && num <40 ) {
            System.out.println("you are young");
        } else if (num>41 ) {
            System.out.println("you are elder");
        }
        else {
            System.out.println("Sorry you are child ");
        }
    }
}

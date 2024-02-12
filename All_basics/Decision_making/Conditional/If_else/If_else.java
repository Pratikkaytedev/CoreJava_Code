package All_basics.Decision_making.Conditional.If_else;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("enter he number ");
        int num = r.nextInt();
        if (num>18){
            System.out.println("you are eligible");
        }
        else {
            System.out.println("Sorry you are not eligible ");
        }
    }
}

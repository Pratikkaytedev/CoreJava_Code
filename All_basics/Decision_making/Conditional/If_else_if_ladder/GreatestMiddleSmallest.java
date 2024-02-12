package All_basics.Decision_making.Conditional.If_else_if_ladder;

public class GreatestMiddleSmallest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 40;
        int num3 = 30;

        if (num1>num2 && num1>num3) {
            System.out.println("num1 is greater " + num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is greater "+ num2);
        } else if (num3>num1 && num3>num2) {
            System.out.println("num3 is greater "+ num3);
        } else {
            System.out.println("all the number are equals");
        }

    }
}

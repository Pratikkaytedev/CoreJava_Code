package All_basics.Operators;

public class Increment_Decrement {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        int num3 = 5;
        int num4 = 5;
        System.out.println("increment operator "+ num1++);
        System.out.println("after increment operator "+ num1 );
        System.out.println("decrement operator "+ num2--);
        System.out.println("after decrement operator "+ num2);

        System.out.println("after pre increment operator "+ ++num3);

        System.out.println("after pre decrement operator "+ --num4);

    }
}

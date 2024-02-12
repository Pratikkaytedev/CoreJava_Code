package Exception_handling.Try_Catch_Final;

public class Handling {
    public static void main(String[] args) {
        try
        {
            System.out.println("learn coding");
            int a=20,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("likeshare");
        }
        catch (ArithmeticException a){
            System.out.println("cannot divide by zero");
        }
        finally {
            System.out.println("subscribe");
        }
        System.out.println("main method ended successfully");
    }
}

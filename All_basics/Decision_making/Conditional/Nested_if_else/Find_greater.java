package All_basics.Decision_making.Conditional.Nested_if_else;

public class Find_greater {
    public static void main(String[] args) {
        int num1 =5;
        int num2 =6;
        int num3 =7;
        if (num1>num2){
            if (num1>num3){
                System.out.println("num1 is greater");
            }
            else {
                System.out.println("num3 is greater");
            }
        }
        else {
            if (num2>num3){
                System.out.println("num2 is greater");
            }
            else {
                System.out.println("num3 is greater");
            }
        }
    }
}

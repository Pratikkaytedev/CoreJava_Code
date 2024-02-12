package Exception_handling.Try_Catch;

public class Number_format_exception {
    public static void main(String[] args) {
        String str= "ankit";
        try {
            int a=Integer.parseInt(str);
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println("string numberFormatException");
        }
        System.out.println("code completed");
    }
}

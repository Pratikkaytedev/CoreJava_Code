package Exception_handling.Problems;

public class Even_Odd {

    public void check(int num) throws Exception {

            if (num%2==0){
                System.out.println("given number is even " + num);
            }else {
                throw new Exception("given number is odd "+ num);
            }

        System.out.println("code finished successfully");
    }

}

class Main {
    public static void main(String[] args) throws Exception{
        Even_Odd e= new Even_Odd();
        e.check(21);
    }
}

package PRACTICE.Leet_code.If_Else_If;

import java.util.Scanner;

public class Weird {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter n");
        int n = r.nextInt();
        String s= "not weird";
        if(n%2==1){
            System.out.println("Weird");
        }
        else {
            if (n>=2 && n<=5)
            {
               s= "between 2 to 5";
            }
            else if (n>=6 && n<=20)
            {
                s= "between 6 to 20";
            }
            else if (n>20)
            {
                s= "above 20";
            }
            System.out.println(s);
        }
    }
}

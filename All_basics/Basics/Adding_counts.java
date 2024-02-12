package All_basics.Basics;

public class Adding_counts {
    public static void main(String[] args) {


        int num1 = 246;
        int rem=0;
        int sum = 0;
        int count = 0;

        while (num1>0){
             rem = num1%10;
             num1= num1/10;
             count++;
             sum=sum+rem;

        }
        System.out.println(count);
        System.out.println(sum);


    }
}

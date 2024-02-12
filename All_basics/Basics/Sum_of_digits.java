package All_basics.Basics;

public class Sum_of_digits {
    public static void main(String[] args) {
        int num=12345;
        int sum=0;
        int rem=0;

      while (num>0)
      {
          sum = num%10;
          System.out.println(sum);
          num = num/10;
          rem = rem+sum;
      }
        System.out.println("the sum of numbers is " +rem);
    }
}

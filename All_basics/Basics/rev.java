package All_basics.Basics;

public class rev {

    public static void main(String[] args) {

        int num=2468;
        int rev;

        while (num>0){
            rev=num%10;
            num=num/10;
            System.out.println(rev);
        }
    }
}

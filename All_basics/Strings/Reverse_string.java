package All_basics.Strings;

public class Reverse_string {

    public static void main(String[] args) {


        // reverse a string by using for loop
        String name="Pratik";
        int length = name.length();
        String rev = "";
        for (int i = length-1; i >=0 ; i--) {
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);


        //reverse a string by using StringBuffer
        String name1 = "dilip";
        StringBuffer sb = new StringBuffer(name1);
        StringBuffer sb1 = sb.reverse();
        System.out.println(sb1);

        //reverse a string by using StringBuffer
        String name2 = "kayte";
        StringBuilder sb2= new StringBuilder(name2);
        StringBuilder sb3 = sb2.reverse();
        System.out.println(sb3);

    }
    }

package Collection_framework.Basic.List_Interface;
import java.util.*;
public class Pract {
    public static void main(String[] args) {

        ArrayList urkude = new ArrayList();

        urkude.add("Narayan");
        urkude.add("Rajni");
        urkude.add("Mayuri");
        urkude.add("Mayuri");

        System.out.println("urkude family is "+ urkude);

        ArrayList kayte = new ArrayList();

        kayte.add("Dilip");
        kayte.add("Sunanda");
        kayte.add("Sneha");
        kayte.add("Pratik");

        System.out.println("kayte family is "+ kayte);


        ArrayList complete = new ArrayList();
        complete.addAll(urkude);
        complete.addAll(kayte);
        System.out.println("complete family is "+ complete);
    }
}

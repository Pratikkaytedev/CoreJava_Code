package Collection_framework.Basic.List_Interface;

import java.util.ArrayList;
import java.util.LinkedList;

public class Aray_list {
    public static void main(String[] args) {
        // There are two types of add data
        // 1:- Type Safe.
        ArrayList<String> ref = new ArrayList<>();
        ref.add("Mayuri");
        ref.add("Narayan");
        ref.add("urkude");
        ref.add("Narayan");
        //provide random access
        System.out.println(ref.get(0));
        System.out.println(ref);

        // 2:- UnType Safe.
        ArrayList refer = new ArrayList<>();
        refer.add("Pratik");
        refer.add(26.6);
        refer.add("Gunthara");
        refer.add(true);

        System.out.println(refer);

        LinkedList na = new LinkedList();
        na.add("pratikk");
        na.add("kaytee");
        na.add("dilippp");
        na.add("dilippp");
        System.out.println(na);

    }
}

package Collection_framework.Basic.Treverse;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Pratik");
        names.add("Dilip");
        names.add("Kayte");
        names.add("Thankyou");
        System.out.println(names);

        //Traversing using for each methodd
        for (String r: names){
            System.out.print(r+" "+r.length()+",");
            //for reverse we using stringbuffer and stringbuilder
            StringBuffer b=new StringBuffer(r);
            System.out.println();
            System.out.print(b.reverse());
        }

        System.out.println("__________________");
        //Traversing using Iterator : Forward traversing

        Iterator<String> itr= names.iterator();

        while (itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }

        //Backward Traversal of collection ListIterator
        ListIterator<String> litr = names.listIterator(names.size());
        while (litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);
        }
    }
}
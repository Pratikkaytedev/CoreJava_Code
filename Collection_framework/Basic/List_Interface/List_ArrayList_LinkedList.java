package Collection_framework.Basic.List_Interface;

import java.util.*;


public class List_ArrayList_LinkedList {
    // list Interface

    public static void main(String[] args) {
        ArrayList <String> ref= new ArrayList<>();  //ArrayList()
        ref.add("Pratik");
        ref.add("Kayte");
        ref.add("Kayte");
        System.out.println(ref);
        ref.add(1,"dilip");
        ref.remove("Kayte");
        System.out.println(ref.get(2));
        System.out.println();


        LinkedList<Integer> num=new LinkedList<>();  //LinkedList()
        num.add(2);
        num.add(3);
        num.add(5);
        num.add(6);
        System.out.println(num);
        num.add(2,4);
        System.out.println(num);

        Vector v= new Vector();
        v.add("one");
        v.add("two");
        v.add("three");
        v.add("four");
        v.add(1,"five");
        v.add("six");

        System.out.println(v.capacity());
        System.out.println(v);

        Iterator itr =  v.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

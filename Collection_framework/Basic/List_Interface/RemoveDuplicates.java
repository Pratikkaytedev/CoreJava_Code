package Collection_framework.Basic.List_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(30);
        list.add(70);

        System.out.println("Before removing duplicates");

        for (int i : list){
            System.out.print(i+" ");
        }

        System.out.println("After removing duplicates");

        List<Integer> list1 = new ArrayList<>();


        for (int in : list){
            if(!list1.contains(in)){
               list1.add(in);
            }
        }

        System.out.println(list1);

        list.clear();

        list.addAll(list1);

        System.out.println(list);

    }

}

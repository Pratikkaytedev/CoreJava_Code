package Collection_framework.Basic.Set_Interface;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet <Double> has=new HashSet<>();
        has.add(22.3);
        has.add(33.3);
        has.add(43.3);
        has.add(53.3);
        has.add(63.3);
        System.out.println(has);

        TreeSet<Double> tre = new TreeSet<>();
        tre.addAll(has);
        System.out.println(tre);
    }
}
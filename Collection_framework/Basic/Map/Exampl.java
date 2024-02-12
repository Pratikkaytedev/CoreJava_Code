package Collection_framework.Basic.Map;
import java.util.*;
public class Exampl {
    public static void main(String[] args) {
        HashMap <String,Integer> courses=new HashMap<>();
        courses.put("core java",4000);
        courses.put("Python",5000);
        courses.put("HTML",3500);
        courses.put("CSS",3000);
        courses.put("SCRIPT",5500);
        System.out.println(courses);
        System.out.println(courses.get("core java."));
    }
}

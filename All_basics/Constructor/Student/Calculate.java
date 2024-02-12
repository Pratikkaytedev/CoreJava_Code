package All_basics.Constructor.Student;

public class Calculate {
    static  int cube(int a){
        return a*a*a;
    }

    public static void main(String[] args) {
        int result= Calculate.cube(5);
        System.out.println(result);
    }
}

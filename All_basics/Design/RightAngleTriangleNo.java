package All_basics.Design;

public class RightAngleTriangleNo {
    public static void main(String[] args) {
        int k=1;

        for (int i = 1; i <=7; i++) {
            for (int j = 0; j < (7-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("@");
            }
            System.out.println();
        }


    }
}
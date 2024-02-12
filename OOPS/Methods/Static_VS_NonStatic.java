package OOPS.Methods;

public class Static_VS_NonStatic {
    static int a= 5;
    int b = 7;

    public static void main(String[] args) {
        Static_VS_NonStatic r= new Static_VS_NonStatic();
        r.shows();
        Static_VS_NonStatic.show();
    }
    static void show(){
        System.out.println(a);
    } //static method
    void shows(){
        System.out.println(a+ " "+b);
    } // Non-Static method

}

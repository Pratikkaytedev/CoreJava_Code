package OOPS.Methods.Recusrion;

public class Sum_of_number {
    public static void main(String[] args) {
        Sum_of_number r= new Sum_of_number();
       int a = r.sum(3);
        System.out.println("sum of first natural number : "+ a);

    }
    int sum (int b)
    {
        if (b>0)
        {
            return  b+sum(b-1); //calling itself
        }
        else {
            return 0;
        }
    }
}

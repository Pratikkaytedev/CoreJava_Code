package Hs_Group_Classes.Oops.Abstraction.Abstract_class.Banking_loan;

public abstract class  Rbi {
    protected double interestRate;

    Rbi (double interestRate){
        this.interestRate=interestRate;
    }

    public abstract double calculateEMI(double principle, double tenure);

    public double calculateInterest(double principle, double tenure){

        return principle*interestRate*tenure/100 ;
    }

}

class  Sbi extends Rbi{

    Sbi() {
        super(10);
    }

    @Override
    public double calculateEMI(double principle, double tenure) {
        double interest=calculateInterest(principle,tenure);
        return (principle + interest)/tenure;
    }


    public double totalLoan(double principle ) {
        return 0;
    }
}
class Main {
    public static void main(String[] args) {
        Sbi s=new Sbi();
        System.out.println("calculateEMI "+s.calculateEMI(20000,4));
        System.out.println("calculateInterest "+s.calculateInterest(100,2));

    }
}
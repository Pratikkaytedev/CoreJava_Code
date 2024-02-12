package Hs_Group_Classes.Oops.Inheritance.Heirarchical.BankAccount;

public class BankAccount {
    String account_num;
    int  balance;
    BankAccount (String account_num,int balance){
        this.account_num = account_num;
        this.balance= balance;
    }

    void deposit(int amount){
        balance=amount+balance;
        System.out.println("current balance after deposit is "+balance);
    }

    void withdraw(int amount){
        if (amount<balance){
            balance=balance-amount;
            System.out.println("current balance after withdraw is "+ balance);

        }else {
            System.out.println("dont have sufficient balance");
        }
    }
    int  getBalance(){
        System.out.println("getballance called of BankAccount class");
return balance;
    }
}
class SavingAccount extends BankAccount{
    double interestRate;

    SavingAccount (String account_num,int balance,double interestRate  ){
        super(account_num,balance);
        this.interestRate=interestRate;
    }

    @Override
    void deposit(int amount) {
        super.deposit(amount);
    double  interestEarned = getBalance()*interestRate;
    }
}
class  Person1 extends SavingAccount{
    Person1(String acccount_num, int balancce,double interestRate){
        super(acccount_num,balancce, interestRate);
    }

    @Override
    void deposit(int amount) {
        super.deposit(amount);
    }

    @Override
    void withdraw(int amount) {
        super.withdraw(amount);
    }
}


class  Main {
    public static void main(String[] args) {
//        BankAccount ba= new BankAccount("Pratik",100);
//        ba.deposit(200);
//        ba.withdraw(100);
//        System.out.println("balance is "+ ba.getBalance());
//
//        SavingAccount sa= new SavingAccount("Pratik", 300,10);
//
//        sa.deposit(5000);
//        sa.withdraw(800);
//        System.out.println("balance is "+sa.getBalance() );
        Person1 p1= new Person1("Mayuri",500,5);


        p1.deposit(200);
       // p1.withdraw(600);
        //p1.getBalance();
    }

}


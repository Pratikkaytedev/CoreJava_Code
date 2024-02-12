package PRACTICE.Basics;

public class Account {
    String name;
    int account_No;
    float amount;

    void input(String n, int ac, float amt) {
        name = n;
        account_No = ac;
        amount = amt;

    }

    void deposit(float amt) {
        amount = amount + amt;
        System.out.println(amt + "deposited");
    }

    void withdraw(float amt) {
        if (amount > amt) {
            System.out.println("insufficient balancee");
        } else {
            amount = amount - amt;
            {
                System.out.println(amt + "withdraw");
            }
        }
    }

    void checkdisplay() {
        System.out.println("balance is " + amount);
    }

    void display() {
        System.out.println(account_No + " " + name + " " + amount);
    }
}
class TestAccount{
    public static void main(String[] args) {
        Account a=new Account();
        a.input("Pratik",441904,10000);
       a.deposit(5000);
       a.checkdisplay();
       a.withdraw(10000);
       a.checkdisplay();
    }
}
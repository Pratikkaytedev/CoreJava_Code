package Practiceee;

public class banking {
     String accountNumber;
    private double balance;

    // Constructor
    public banking(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;


        this.balance = initialBalance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {

        if(balance>0 && balance<100){

        }else{
            System.out.println("wrong data");
        }


         this.balance=balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited into the account.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from the account.");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        banking account = new banking("12345", 1000.0);

account.setBalance(5000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(500.0);
        account.withdraw(200.0);

        System.out.println("Updated Balance: " + account.getBalance());
    }
}
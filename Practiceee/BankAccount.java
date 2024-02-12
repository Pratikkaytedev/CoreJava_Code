    package Practiceee;

    import java.util.Random;
    public class BankAccount {

        private long accountNumber;
        private String accountHolderName;
        private double balance;

        private long newaccountNumber = 100000001;

        public BankAccount(double balance,String accountHolderName){
            this.accountNumber=newaccountNumber++;
            this.balance=balance;
            this.accountHolderName=accountHolderName;
        }



        public double deposit(double amount){

            if(amount>0 ){

                balance = balance+amount;

            }else{
                System.out.println("Amount is greater than zero");
            }
            return balance;
        }

        public double withdraw(double amount){

            if(amount>0 & amount<=balance){

                balance = balance-amount;
            }else if(amount>=balance){
                System.out.println("insufficient amount");
            }else{
                System.out.println("Amount is greater than zero");
            }


            return balance;
        }

        public double getBalance(){
            return balance;
        }

        public String toString(){
            return "Welcome "+ accountHolderName+" Your  Account no: "+ accountNumber+" and Baance is "+ balance;
        }


    }
    class BankAccountTest {
        public static void main(String[] args) {
            BankAccount b = new BankAccount(10000,"Pratik Dilip Kayte");

            System.out.println("your balance amount is "+b.getBalance());
            b.deposit(200);
            System.out.println(b.getBalance());
            System.out.println(b.withdraw(1200));
            System.out.println(b.toString());
        }
    }

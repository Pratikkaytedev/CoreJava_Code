package All_basics.Basics;

import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args) {
        double balance = 10000.00;
        double withdraw, deposit;
        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Machine");

        do {
            System.out.println("Press 1 to deposit");
            System.out.println("Press 2 to withdraw");
            System.out.println("Press 3 to check balance");
            System.out.println("Press 4 to exit");

            System.out.println("Select an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to deposit: ");
                    deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("You have successfully deposited the amount. Your balance is: " + balance);
                    break;

                case 2:
                    System.out.println("Enter the amount you want to withdraw: ");
                    withdraw = scanner.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance. Please try again.");
                    } else {
                        balance -= withdraw;
                        System.out.println("You have successfully withdrawn the amount. Your balance is: " + balance);
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM Machine. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}

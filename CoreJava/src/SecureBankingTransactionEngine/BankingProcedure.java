package SecureBankingTransactionEngine;

import java.util.Scanner;

public class BankingProcedure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        try {
            // Account Creation
            System.out.println("Select Account Type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.print("Enter choice: ");
            int accChoice = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Account Number: ");
            String accNo = sc.nextLine();
            System.out.print("Enter Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();
            System.out.print("Set Account Password: ");
            String password = sc.nextLine();

            switch (accChoice) {
                case 1:
                    account = new SavingsAccount(accNo, password, name, balance);
                    break;

                case 2:
                    account = new CurrentAccount(accNo, password, name, balance);
                    break;

                default:
                    System.out.println("Invalid account type selected");
                    return;
            }

            // Password Verification
            System.out.print("Enter password to login: ");
            String enteredPassword = sc.nextLine();

            if (!account.verifyPassword(enteredPassword)) {
                System.out.println("Authentication Failed due to Incorrect Password");
                return;
            }

            System.out.println("Login successful!");

            // Transaction Menu 
            // Add a try catch block in order to handle unpredictable choice input 
            int choice;
            do {
                System.out.println("\n*** Banking Menu ***");
                System.out.println("1. Deposit (Cash)");
                System.out.println("2. Deposit (Online)");
                System.out.println("3. Withdraw");
                System.out.println("4. Withdraw with Remarks");
                System.out.println("5. Check Balance");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double cashAmt = sc.nextDouble();
                        account.deposit(cashAmt);
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double onlineAmt = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter mode: ");
                        String mode = sc.nextLine();
                        account.deposit(onlineAmt, mode);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double wdAmt = sc.nextDouble();
                        account.withdraw(wdAmt);
                        break;
                    case 4:
                        System.out.print("Enter withdrawal amount: ");
                        double wdAmt2 = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter remarks: ");
                        String remarks = sc.nextLine();
                        account.withdraw(wdAmt2, remarks);
                        break;
                    case 5:
                        System.out.println("Available Balance: " + account.getBalance());
                        break;
                    case 6:
                        System.out.println("Exiting Banking System...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 0);
            
        } catch (InvalidAmountException e) {
            System.out.println("Validation Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } finally {
            sc.close();
            System.out.println("Transaction session closed");
        }
    }
}

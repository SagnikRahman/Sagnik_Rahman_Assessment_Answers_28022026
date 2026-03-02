package SecureBankingTransactionEngine;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String password, String holderName, double balance) throws InvalidAmountException {
        super(accountNumber, password, holderName, balance);
    }

    @Override
    protected void processWithdrawal(double amount) {

        if (amount > getBalance()) {
            throw new InsufficientBalanceException("Insufficient balance in Savings Account");
        }

        setBalance(getBalance() - amount);
        System.out.println("Savings account withdrawal: " + amount);
    }
}

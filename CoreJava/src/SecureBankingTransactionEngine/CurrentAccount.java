package SecureBankingTransactionEngine;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, String password, String holderName, double balance) throws InvalidAmountException {
    	super(accountNumber, password, holderName, balance);
	}

    @Override
    protected void processWithdrawal(double amount) {

        if (amount > getBalance()) {
            throw new InsufficientBalanceException("Current account withdrawal limit exceeded");
        }

        setBalance(getBalance() - amount);
        System.out.println("Current account withdrawal: " + amount);
    }
}

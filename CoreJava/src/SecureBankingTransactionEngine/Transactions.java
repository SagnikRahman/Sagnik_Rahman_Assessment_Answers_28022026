package SecureBankingTransactionEngine;

public interface Transactions {
	void deposit(double amount) throws InvalidAmountException;
    void withdraw(double amount) throws InvalidAmountException;
}

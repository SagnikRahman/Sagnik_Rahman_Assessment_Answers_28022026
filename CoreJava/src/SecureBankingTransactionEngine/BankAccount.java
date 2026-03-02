package SecureBankingTransactionEngine;

public abstract class BankAccount implements Transactions {

    private String accountNumber;
    private String password;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String password, String holderName, double balance) throws InvalidAmountException {
        if (balance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.password = password;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
    
    public boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    protected void validateAmount(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero");
        }
    }

    //
    public void deposit(double amount) throws InvalidAmountException {
        validateAmount(amount);
        setBalance(getBalance() + amount);
        System.out.println("Cash deposit successful: " + amount);
    }

    public void deposit(double amount, String mode) throws InvalidAmountException {
        validateAmount(amount);
        setBalance(getBalance() + amount);
        System.out.println(mode + " deposit successful: " + amount);
    }

    //
    public void withdraw(double amount) throws InvalidAmountException {
        validateAmount(amount);
        processWithdrawal(amount);
    }

    public void withdraw(double amount, String remarks) throws InvalidAmountException {
        validateAmount(amount);
        processWithdrawal(amount);
        System.out.println("Remarks: " + remarks);
    }

    protected abstract void processWithdrawal(double amount);
}

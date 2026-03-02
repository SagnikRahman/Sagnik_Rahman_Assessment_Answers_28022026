package Practice;

public class BankingTransactionEngine {

    interface Transaction {
        void deposit(double amount);
        void withdraw(double amount);
    }

    static abstract class BankAccount implements Transaction {
        private String accountNo;
        private String holder;
        private double balance;

        protected BankAccount(String accountNo, String holder, double balance) {
            this.accountNo = accountNo;
            this.holder = holder;
            setBalance(balance);
        }

        public String getAccountNo() { 
        	return accountNo; 
        }
        public String getHolder() { 
        	return holder; 
        }
        public double getBalance() { 
        	return balance; 
        }

        protected void setBalance(double balance) {
            if (balance < 0) {
                throw new InvalidAmountException("Negative balance not allowed");
            }
            this.balance = balance;
        }

        @Override
        public void deposit(double amount) {
            if (amount <= 0) {
                throw new InvalidAmountException("Deposit must be positive");
            }
            setBalance(balance + amount);
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        }

        public void deposit(double amount, String mode) {
            System.out.print("[" + mode + "] ");
            deposit(amount);
        }

        @Override
        public abstract void withdraw(double amount);
        
        @Override
        public String toString() {
            return String.format("Account [%s] - %s | Balance: Rs.%.2f", accountNo, holder, balance);
        }
    }

    static class SavingsAccount extends BankAccount {
        SavingsAccount(String acc, String holder, double bal) {
            super(acc, holder, bal);
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= 0) throw new InvalidAmountException("Invalid amount");
            if (amount > getBalance()) {
                throw new InsufficientBalanceException("Savings: Insufficient funds");
            }
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount + " | New Balance: " + getBalance());
        }
    }

    static class CurrentAccount extends BankAccount {
        CurrentAccount(String acc, String holder, double bal) {
            super(acc, holder, bal);
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= 0) throw new InvalidAmountException("Invalid amount");
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount + " | New Balance: " + getBalance());
        }
    }

    public static void transfer(BankAccount from, BankAccount to, double amount) {
        System.out.println("\nTransferring " + amount + " from " + from.getHolder() + " to " + to.getHolder());
        from.withdraw(amount);
        to.deposit(amount);
    }

    public static void main(String[] args) {
        try {
            BankAccount savings = new SavingsAccount("SA101", "Alice", 1000.0);
            BankAccount current = new CurrentAccount("CA202", "Bob", 500.0);

            System.out.println(savings);
            System.out.println(current);

            savings.deposit(250.0, "Mobile Check");
            current.withdraw(100.0);

            transfer(savings, current, 400.0);

            System.out.println("\nFinal States:");
            System.out.println(savings);
            System.out.println(current);

        } catch (RuntimeException e) {
            System.err.println("Transaction Failed: " + e.getMessage());
        }
    }

    static class InvalidAmountException extends RuntimeException {
        InvalidAmountException(String msg) { 
        	super(msg); 
        }
    }

    static class InsufficientBalanceException extends RuntimeException {
        InsufficientBalanceException(String msg) { 
        	super(msg); 
        }
    }
}
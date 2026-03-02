package exception.unchecked_exception;

public class CustomUncheckedExceptionDemo {
	public static void withdraw(double balance, double amount) {
		if(amount > balance) {
			throw new InsufficientBalanceException("Withdrawal amount exceeds the available balance.");
		}
		System.out.println("Withdrawal successful! Remaining balance: " + (balance - amount));
	}
	
	public static void main(String[] args) {
		double balance = 50000;
		double withdrawAmount = 60000;
		
		try {
			withdraw(balance, withdrawAmount); //This will throw the exception
		} catch (InsufficientBalanceException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}
}


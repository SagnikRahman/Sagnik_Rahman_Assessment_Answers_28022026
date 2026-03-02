package exception.unchecked_exception;

// Define Custom Runtime Exception
public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

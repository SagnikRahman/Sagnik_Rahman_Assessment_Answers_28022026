package transaction_system;

public class InvalidPinException extends Exception{
	public InvalidPinException(String msg) {
		super(msg);
	}
}

package transaction_system;

class ATM {
	 private int correctPin = 1234;
	 
	 public void authenticate(int pin) throws InvalidPinException {

	     if (pin != correctPin) {
	    	 throw new InvalidPinException("Wrong PIN");
	     } else {
	         System.out.println("Authentication Successful");
	     }
	 }
}

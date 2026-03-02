package exception.checked_exception;

public class CustomCheckedExceptionDemo {
	public static void validateAge(int age) throws InvalidAgeException, RandomException {
		if(age < 18) {
			throw new InvalidAgeException("Age must be 18 or older to register.");
		} else if (age >= 18 && age < 21) {
			System.out.println("Age is valid but with restrictions. Proceed to registration.");
//			throw new RandomException("Random Exception");
//			return Permit.SOFT;
		} else {
			System.out.println("Age is valid. Proceed to registration.");
//			return Permit.HARD;
		}
	}
	
	public static void main(String[] args) {
		
		try { 
			validateAge(18); // this will throw the exception
		} catch (InvalidAgeException e) {
			System.out.println("Caught exception: " + e.getMessage());
		} 
			catch (RandomException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}
}

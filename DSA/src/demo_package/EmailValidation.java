package demo_package;

public class EmailValidation {

	static String email = "sagnik1504@gmail.com";
	
	public static void main(String [] args) {
		if (isEmailValid(email)) {
			System.out.println("Valid");
		} else {
			System.out.println("NOT Valid");
		}
	}
	
	public static boolean isEmailValid(String email) {
		//email must have only one '@'
		if (email.endsWith("@gmail.com")) {
			
		} else {

		}
		return true;
	}
}

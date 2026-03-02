package exception.checked_exception;

public class Check {
	public static void chechAge(int age) throws MyException {
		if(age<18)
			throw new MyException("Not eligible to vote");
		else
			System.out.println("Eligible to vote");
	}
	public static void main(String[] args) {
		int age = 15;
		try {
			chechAge(age);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}

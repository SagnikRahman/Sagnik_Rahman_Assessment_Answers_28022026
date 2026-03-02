package exception.unchecked_exception;

public class Check {
	
	public static void main(String[] args) {
		int age = 25;
		try {
			if(age<18)
				throw new MyException("NOT");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}

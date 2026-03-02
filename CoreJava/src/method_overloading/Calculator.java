package method_overloading;

public class Calculator {
	public static void addition() {
		//base1
	}
	
	public static void addition(double op1, double op2) {
		//no of args
		//base2 (compare it with base1)
	}
	
	public static void addition(float op1, double op2) {
		//change in DT of args
		//base3 (compare it with base1)
	}
	
	public static void addition(double op1, float op2) {
		//change in order of DT of args
		//base4 (compare it with base1)
	}
	
	public static void addition(double op1, char opr, double op2) {
		//change in no of args, DT of args, order of DT of args
		//base5 (compare it with base4)
	}
}

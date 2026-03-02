package method_overriding;

public class DriverPay {
	public static void main(String args[]) {
		It it = new It();
		System.out.println("IT Monthly Salary: "+it.monthlySalCal());
		Supporting supporting = new Supporting();
		System.out.println("Supporting Monthly Salary: "+supporting.monthlySalCal());
	}
}

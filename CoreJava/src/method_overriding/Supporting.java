package method_overriding;

public class Supporting extends Employee{
	double varPay = 100000;
	//
	@Override
	public double monthlySalCal() {
		return (basePay+varPay)/12;
	}
}

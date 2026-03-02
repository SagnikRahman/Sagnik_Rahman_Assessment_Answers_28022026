package method_overriding;

public class It extends Employee{
	double varPay = 200000;
	//
	@Override
	public double monthlySalCal() {
		return (basePay + varPay)/12;
	} 
}

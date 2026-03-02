package Sample;

public class Demoo {
	public static double roundNum(double num) {
		return Double.parseDouble(String.format("%.2f",num));
	}
	public static void main(String[] args) {
		System.out.println(roundNum(4.568));
	}
}

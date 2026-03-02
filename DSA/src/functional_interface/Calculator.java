package functional_interface;

interface Addition {
	int add(int a, int b);
}

interface Factorial {
	int fact(int a);
}

public class Calculator {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		Addition sum = (a, b) -> a + b;
		int num3 = sum.add(num2, num1);
		System.out.println(num3);
		
		Factorial facto = (a) -> {
			int fa = 1;
			for (int i = 1; i < a; i++) {
				fa *= i;
			}
			return fa;
		};
		int factor = facto.fact(num1);
		System.out.println(factor);
	}
}

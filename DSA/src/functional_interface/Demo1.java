package functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo1 {
	
	public static long prod(int a, int b) {
		return a * b;
	}
	
	public static long fact(int n) {
		int f = 1;
		for (int i = 1; i < n; i++) {
			f *= i;
		}
		return f;
	}
	
	public static void main(String[] args) {
		Function<Integer, Double> f1 = (n) -> Math.sqrt(n);
		System.out.println(f1.apply(4));
		
		Function<Integer, Double> f2 = Math::sqrt;
		System.out.println(f2.apply(16));
		
		Function<Integer, Long> f6 = (n) -> Demo1.fact(n);
		System.out.println(f6.apply(15));

		Function<Integer, Long> f3 = Demo1::fact;
		System.out.println(f3.apply(18));
		
		BiFunction<Integer, Integer, Double> f4 = Math::pow;
		System.out.println(f4.apply(6, 3));
		
		BiFunction<Integer, Integer, Long> f7 = (a,b) -> Demo1.prod(a,b);
		System.out.println(f7.apply(100000, 20500));
		
		BiFunction<Integer, Integer, Long> f5 = Demo1::prod;
		System.out.println(f5.apply(150500, 2780320));
	}
}

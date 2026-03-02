package functional_interface;

import java.util.function.Function;

public class Demo {
	public static void main(String[] args) {
		Function<String, Integer> f = (String s) -> s.length();
		System.out.println(f.apply("Hello World"));
	}
}

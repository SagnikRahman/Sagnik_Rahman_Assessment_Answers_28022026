package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.*;

public class Demo4 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10,50,30,75,90);
//		for (int i = 0; i < l.size(); i++) {
//			System.out.println(l.get(i));
//		}
		
//		for(int a : l) {
//			System.out.println(a);
//		}
		
//		Consumer<Integer> c = new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		};

//		l.forEach(n -> System.out.println(n));
		
//		Consumer<Integer> c = t -> System.out.println(t);
//		l.forEach(t -> System.out.println(t));
		
		l.forEach(System.out::println);		
	}
}

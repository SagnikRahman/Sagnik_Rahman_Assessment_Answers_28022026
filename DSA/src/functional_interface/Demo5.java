package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo5 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10,50,30,75,90);
		
//		Stream<Integer> s = l.stream().filter(n -> n>50);
//		Stream<Integer> s = l.stream().filter(n -> n%2==0).sorted();
//		s.forEach(System.out::println);	
		
		l.stream().filter(n -> n%2==0).sorted().forEach(System.out::println);
		
		long count = l.stream().filter(n -> n > 25).count();
		System.out.println(count);
		
		l.stream().filter(n -> n%2==0).sorted().map(n -> n*n).forEach(System.out::println);
		
		List<Integer> res = l.stream().filter(n -> n > 30).collect(Collectors.toList());
		Set<Integer> res1 = l.stream().filter(n -> n > 50).collect(Collectors.toSet());
		
		System.out.println(res);
		System.out.println(res1);
	}
}

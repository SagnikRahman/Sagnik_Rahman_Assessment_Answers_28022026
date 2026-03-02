package object_class.equals;

import method_overriding.Employee;

public class Temp {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		//
		Candidate c1 = new Candidate(1,"Sagnik");
		Candidate c2 = new Candidate(2,"SagnikR");
		Candidate c3 = c1;
		Candidate c4 = null;
		System.out.println(c1.equals(c1));
		System.out.println(c1.equals(c2)); // this is coming false since comparison is being done on address
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
	}
}

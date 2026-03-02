package inheritancePractice;

public class Sample extends A {
	public static void main(String [] args) { 
		
	}
}

class A { 
	int x = 1;
	public static void test() {
		System.out.println("from A");
	}
}

class B { 
	int x = 2;
	public static void test() {
		System.out.println("from B");
	}
}
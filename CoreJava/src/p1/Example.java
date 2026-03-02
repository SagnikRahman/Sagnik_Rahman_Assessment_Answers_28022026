package p1;

public class Example {
	
	static int i = printer();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start of main()");
		System.out.println("end of main()");
	}

	static {
		System.out.println("from static block{}");
	}
	
	public static int printer() {
		System.out.println("Printed by printer");
		return 0;
	}
}

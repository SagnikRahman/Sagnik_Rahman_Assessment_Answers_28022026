package p1;

public class Example2 {

	static int i = staticMethod();
	int j = nonStaticMethod();
	
	static {
		System.out.println("from static block{}");
	}
	
	{
		System.out.println("from non static block{}");
	}
	
	public static int staticMethod() {
		System.out.println("from static method()");
		return 5;
	}

	public int nonStaticMethod() {
		System.out.println("from non static method()");
		return 10;
	}
	
	public Example2() {
		System.out.println("from constructor()");
	}
	
	public static void main(String[] args) {
		System.out.println("start of main()");
		Example2 exa1 = new Example2();
		Example2 exa2 = new Example2();
		System.out.println("end of main()");
	}

}

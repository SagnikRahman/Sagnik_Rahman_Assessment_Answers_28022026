package p1;

public class Example1 {

	int i = 5;
	
	{
		System.out.println("from non static block{}");
	}
	
	public void nonStaticMethod() {
		System.out.println("from non static method()");
	}
	
	public Example1() {
		System.out.println("from constructor()");
	}
	
	public static void main(String[] args) {
		System.out.println("start of main()");
		Example1 exa = new Example1();
		System.out.println("end of main()");
	}

}

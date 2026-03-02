package p1;

public class Example3 {
	
	static int i = 5;
	int j = 10;
	
	public static void main(String[] args) {
		System.out.println(i);
		Example3 exam = new Example3();
		System.out.println(exam.j);
	}

	public void m1() {
		System.out.println(i);
		System.out.println(j);
	}
}

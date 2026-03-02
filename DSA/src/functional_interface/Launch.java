package functional_interface;

interface Draw {
	void circle();
}

public class Launch {
	public static void main(String[] args) {
		Draw d1 = () -> {System.out.println("C1 Draw");};
		d1.circle();
		Draw d2 = () -> {System.out.println("C2 Draw");};
		d2.circle();
	}
}

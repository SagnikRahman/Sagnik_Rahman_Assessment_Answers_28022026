package var_hiding_shadowing.hiding;

public class Test {
	public static void main (String [] args) {
		Parent p = new Child();
		System.out.println(p.x);
		Child c = (Child)p;
		System.out.println(c.x);	
	}
}

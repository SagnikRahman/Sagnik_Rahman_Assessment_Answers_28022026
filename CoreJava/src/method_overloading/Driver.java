package method_overloading;

public class Driver {
	public static void main(String args[]) {
		Parent p = new Parent();
		Child c = new Child();
		p.printNum(6.2);
		c.printNum(5.1); //inherited
		c.printNum(4.8, 7.5); //overloaded
	}
}

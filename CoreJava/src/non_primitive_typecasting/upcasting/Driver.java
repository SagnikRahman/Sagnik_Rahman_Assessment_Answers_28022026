package non_primitive_typecasting.upcasting;

public class Driver {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.p);
		p.pm();
		Child c = new Child();
		System.out.println(c.c);
		c.cm();
		System.out.println(c.p);
		c.pm();
		//upcasting
		Child c1 = new Child();
		Parent p1 = c1; //'p1' is the upcasted variable
		System.out.println(c1.c);
		c1.cm();
		System.out.println(c1.p);
		c1.pm();
		//
//		System.out.println(p1.c); //child members cannot be accessed using upcasted variable
//		p1.cm(); //child members cannot be accessed using upcasted variable
		System.out.println(p1.p);
		p1.pm();
		
	}
}

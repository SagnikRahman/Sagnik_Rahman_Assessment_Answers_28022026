package non_primitive_typecasting.downcasting;

public class Driver {
	public static void main(String[] args) {
//		Parent p = new Parent();
//		Child c = (Child) p; //ClassCastException
		//
		System.out.println("start");
		Child c1 = new Child();
		System.out.println(c1);
		Parent upcastedParentVar = c1;
		System.out.println(upcastedParentVar);
		Child downCastedParentVar = (Child) upcastedParentVar;
		System.out.println(downCastedParentVar);
		//
		System.out.println(downCastedParentVar.p);
		downCastedParentVar.pm();
		System.out.println(downCastedParentVar.c);
		downCastedParentVar.cm();
		System.out.println("end");
		
	}
}

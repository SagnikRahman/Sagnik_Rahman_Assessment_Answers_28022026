package Factory;

public class Driver {
	public static void main(String[] args) {
//		Laptop l1 = new Laptop();
//		Laptop l2 = new Laptop();
//		System.out.println(l1);
//		System.out.println(l2);
//		Laptop l3 = Laptop.laptopFactory();
//		Laptop l4 = Laptop.laptopFactory();
//		Laptop l5 = Laptop.laptopFactory();
//		System.out.println(l3);
//		System.out.println(l4);
//		System.out.println(l5);
		Lazy la = Lazy.lazyFactory();
		System.out.println(la);
		Eager ea = Eager.eagerFactory();
		System.out.println(ea);
	}
}

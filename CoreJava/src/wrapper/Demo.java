package wrapper;

public class Demo {
	public static void main(String[] args) {
//		byte b = 7;
//		System.out.println("b: " + b);
//		// wrapping/autoboxing
//		Byte b1 = b;
//		System.out.println("b1: " + b1);
//		// unwrapping/unboxing
//		byte b2 = b1;
//		System.out.println("b2: " + b2);
//		// parsing
//		String bStr = "7";
//		System.out.println("Type of bStr: " + bStr.getClass());
//		// Parsing using constructor
//		Byte b3 = new Byte(bStr);
//		System.out.println("b3: " + b3);
//		System.out.println("Type of b3: " + b3.getClass());
//		// Parsing using parse... method
//		Byte b4 = Byte.parseByte(bStr);
//		System.out.println("b4: " + b4);
		
		String s = "1+";
		byte parseByte = Byte.parseByte(s);
		System.out.println("parseByte: "+ parseByte);
	}
}

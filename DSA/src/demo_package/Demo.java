package demo_package;

public class Demo {
	
	public static void main(String[] args) {
		String str1 = "Kunal";
		String str2 = "Kunal";
		String str3 = new String("Kunal");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
	}
}

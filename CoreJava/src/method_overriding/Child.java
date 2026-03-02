package method_overriding;

import java.util.Scanner;

public class Child extends Parent{
	@Override 
	public void printStar() {
		System.out.println("Enter star count: ");
		Scanner input = new Scanner(System.in);
		int starCount = input.nextInt();
		input.nextLine();
		input.close();
		for (int i = 0; i < starCount; i++) {
			System.out.println("*");
		}
	}
}

package NewProject;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		//
		System.out.print("Enter 3 digit number: ");
		short num = userInput.nextShort();
		userInput.nextLine();
		System.out.println("Enter a string: ");
		String name = userInput.nextLine();
		System.out.println("num : " + num);
		System.out.println("name : " + name);
	}

}

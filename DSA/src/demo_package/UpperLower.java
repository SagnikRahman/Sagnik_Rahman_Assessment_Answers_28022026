package demo_package;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.next();
		sc.nextLine();
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((int)ch >= 65 && (int)ch <= 90)
				newStr+=(char)(ch + 32);
			else if((int)ch >= 97 && (int)ch <= 122)
				newStr+=(char)(ch - 32);
			else
				newStr+=ch;
		}
		System.out.println("Modified string: "+newStr);
	}

}

package demo_package;

import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(String str) {
		 int l = str.length();
		 char ch1,ch2;
		 for (int i = 0, j = l-1; i < l/2; i++, j--) {
			ch1 = str.charAt(i);
			ch2 = str.charAt(j);
			if(ch1==ch2) {
				return true;
			}
		 }
		 return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = sc.nextLine();
		boolean checker = checkPalindrome(str);
		if(checker == true)
			System.out.println("The string is palindrome");
		else
			System.out.println("The string is not palindrome");
	}

}

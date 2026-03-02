package demo_package;

import java.util.Scanner;
//Removes spaces from the beginning of the string
public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = sc.nextLine();
		int pos=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				pos=i;
				break;
			}
		}
		System.out.println("Modified string:"+str.substring(pos));
	}

}

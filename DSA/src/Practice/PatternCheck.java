package Practice;

import java.util.Scanner;

public class PatternCheck {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = sc.nextLine();
		System.out.print("Enter the pattern to check: ");
		String patt = sc.nextLine();
        boolean found = false;
        for (int i = 0; i <= text.length() - patt.length(); i++) {
            int j;
            for (j = 0; j < patt.length(); j++) {
                if (text.charAt(i + j) != patt.charAt(j)) {
                    break;
                }
            }
            if (j == patt.length()) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Pattern exists");
        } else {
            System.out.println("Pattern does not exist");
        }
        sc.close();
    }
}

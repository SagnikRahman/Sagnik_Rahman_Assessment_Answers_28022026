package NewProject;

public class NumOrChar {

	public static void main(String[] args) {
		char ch = 'a';
		if((int)ch >= 65 && (int)ch <=90)
			System.out.println(ch + " is an uppercase character");
		else if((int)ch >= 97 && (int)ch <= 122)
			System.out.println(ch + " is a lowercase character");
		else if((int)ch >= 48 && (int)ch <= 57)
			System.out.println(ch + " is a number");
		else
			System.out.println(ch + " is a special character");
	}
}

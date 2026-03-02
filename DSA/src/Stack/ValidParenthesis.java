package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
	static Scanner input = new Scanner(System.in);
	
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) return false;
				
				char top = stack.pop();
				if (c == ')' && top != '(') return false;
				if (c == '}' && top != '{') return false;
				if (c == ']' && top != '[') return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		ValidParenthesis vP = new ValidParenthesis();
		System.out.print("Enter the parenthesis expression: ");
		String str = input.nextLine();
		if(vP.isValid(str))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}

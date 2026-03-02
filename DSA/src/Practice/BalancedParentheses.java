package Practice;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {	
	public boolean isBalanced(String s) {
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
		BalancedParentheses bP = new BalancedParentheses();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the parentheses expression: ");
		String str = sc.nextLine();
		if(bP.isBalanced(str))
			System.out.println("Balanced Parentheses");
		else
			System.out.println("NOT Balanced Parentheses");
		sc.close();
	}
}

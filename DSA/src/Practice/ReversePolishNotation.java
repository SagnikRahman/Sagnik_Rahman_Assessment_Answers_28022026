package Practice;

import java.util.*;

public class ReversePolishNotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String exp = sc.nextLine();
            System.out.println(toRPN(exp));
        }
    }

    static String toRPN(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : exp.toCharArray()) {
            if (Character.isLetter(ch)) {
                result.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                stack.push(ch);
            }
            else {
            	while (!stack.isEmpty() && stack.peek() != '(') {
        		result.append(stack.pop());
            }
            stack.pop(); 
            }
        }
        return result.toString();
    }
}
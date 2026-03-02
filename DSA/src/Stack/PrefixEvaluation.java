package Stack;

import java.util.Stack;

public class PrefixEvaluation {
    static int evaluatePrefix(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int a = stack.pop();
                int b = stack.pop();
                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String prefix = "-+9*234";
        System.out.println(evaluatePrefix(prefix)); 
    }
}

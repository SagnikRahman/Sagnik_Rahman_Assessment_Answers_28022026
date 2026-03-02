package Practice;

import java.util.*;

public class EvaluateExpression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            System.out.println(evaluateRPN(S));
        }
    }

    public static long evaluateRPN(String s) {
        ArrayDeque<Long> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push((long)(ch - '0'));
            }
            else {
                long b = stack.pop();
                long a = stack.pop();
                if (ch == '+')
                    stack.push(a + b);
                else if (ch == '-')
                    stack.push(a - b);
                else if (ch == '*')
                    stack.push(a * b);
            }
        }
        return stack.pop();
    }
}
package Stack;

import java.util.Stack;

public class DuplicateParentheses {
    public static void main(String[] args) {
        String exp = "((a+b))";
        Stack<Character> st = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (c == ')') {
                int count = 0;
                while (st.pop() != '(')
                    count++;
                if (count == 0) {
                    System.out.println(true);
                    return;
                }
            } else st.push(c);
        }
        System.out.println(false);
    }
}

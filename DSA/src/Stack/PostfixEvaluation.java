package Stack;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String exp = "231*+9-";
        Stack<Integer> st = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c))
                st.push(c - '0');
            else {
                int b = st.pop();
                int a = st.pop();
                switch (c) {
                    case '+': st.push(a+b); break;
                    case '-': st.push(a-b); break;
                    case '*': st.push(a*b); break;
                    case '/': st.push(a/b); break;
                }
            }
        }
        System.out.println(st.pop());
    }
}

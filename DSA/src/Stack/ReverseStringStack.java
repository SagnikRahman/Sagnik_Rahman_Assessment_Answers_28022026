package Stack;

import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        String s = "hello";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray())
            stack.push(c);
        String result = "";
        while (!stack.isEmpty())
            result += stack.pop();
        System.out.println(result);
    }
}

package Stack;

import java.util.Scanner;
import java.util.Stack;

// Evaluation of Reverse Polish Notation
class Rev {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String t : tokens) {
            if ("+-*/".contains(t)) {
                int b = st.pop();
                int a = st.pop();
                if (t.equals("+")) st.push(a + b);
                if (t.equals("-")) st.push(a - b);
                if (t.equals("*")) st.push(a * b);
                if (t.equals("/")) st.push(a / b);
            } else {
                st.push(Integer.parseInt(t));
            }
        }
        return st.pop();
    }
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the Reverse Polish Notation: ");
    	String str = input.nextLine();
    	String str1[] = str.split(" ");
    	System.out.println("After evaluation: " + evalRPN(str1));
    }
}
package Practice;

import java.util.Stack;

public class minimumStack {
	private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public minimumStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void addValue(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
        System.out.println("None");
    }

    public void removeTopValue() {
        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
        System.out.println("None");
    }

    public void getTopValue() {
        System.out.println(stack.peek());
    }

    public void getMinimumValue() {
        System.out.println(minStack.peek());
    }
}
package Stack;

public class Operations {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Operations(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = element;
        System.out.println("Pushed: " + element);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Cannot pop further");
            return -1; 
        }
        int element = stackArray[top--];
        System.out.println("Popped: " + element);
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Peek failed.");
            return -1; 
        }
        int element = stackArray[top];
        System.out.println("Peeked: " + element);
        return element;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Operations stack = new Operations(5);

        System.out.println("Performing Push Operations");
        stack.push(10);
        stack.push(20);
        stack.push(15);

        System.out.println("\nPerforming Peek Operation");
        stack.peek(); 

        System.out.println("\nPerforming More Push Operations");
        stack.push(40);
        stack.push(50);

        System.out.println("\nTesting Stack Overflow");
        stack.push(60);

        System.out.println("\nPerforming Pop Operations");
        stack.pop(); 
        stack.pop();

        System.out.println("\nPerforming Peek Operation");
        stack.peek();

        System.out.println("\nClearing the Stack");
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("\nTesting Stack Underflow");
        stack.pop();
    }
}


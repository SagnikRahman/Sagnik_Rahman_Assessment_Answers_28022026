package Stack;

import java.util.Stack;

public class MinStack {
    static Stack<Integer> st=new Stack<>();
    static Stack<Integer> min=new Stack<>();

    public static void main(String[] args){
        push(5); 
        push(3); 
        push(7);
        System.out.println(getMin());
    }
    static void push(int x){
        st.push(x);
        if(min.isEmpty() || x<=min.peek())
            min.push(x);
    }
    static int pop(){
        int x=st.pop();
        if(x==min.peek()) 
        	min.pop();
        return x;
    }
    static int getMin(){
        return min.peek();
    }
}

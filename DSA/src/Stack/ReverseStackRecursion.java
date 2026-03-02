package Stack;

import java.util.Stack;

public class ReverseStackRecursion {
    static void insertBottom(Stack<Integer> st,int x){
        if(st.isEmpty()){ 
        	st.push(x); 
        	return; 
        }
        int y=st.pop();
        insertBottom(st,x);
        st.push(y);
    }
    static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int x=st.pop();
        reverse(st);
        insertBottom(st,x);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(1); 
        st.push(2); 
        st.push(3);
        reverse(st);
        System.out.println(st);
    }
}

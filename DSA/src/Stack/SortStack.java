package Stack;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(3); st.push(1); st.push(4); st.push(2);

        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            int x=st.pop();
            while(!temp.isEmpty() && temp.peek()>x)
                st.push(temp.pop());
            temp.push(x);
        }
        System.out.println(temp);
    }
}

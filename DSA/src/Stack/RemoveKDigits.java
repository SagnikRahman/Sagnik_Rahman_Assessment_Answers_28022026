package Stack;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args){
        String num="1432219";
        int k=3;
        Stack<Character> st=new Stack<>();

        for(char c:num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop(); k--;
            }
            st.push(c);
        }
        while(k-- > 0) st.pop();

        String res="";
        for(char c:st) 
        	res+=c;
        System.out.println(res.replaceFirst("^0+",""));
    }
}

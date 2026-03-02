package Stack;

import java.util.*;

public class DailyTemperatures {
    public static void main(String[] args){
        int[] t={73,74,75,71,69,72,76,73};
        int[] res=new int[t.length];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<t.length;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                int idx=st.pop();
                res[idx]=i-idx;
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
}

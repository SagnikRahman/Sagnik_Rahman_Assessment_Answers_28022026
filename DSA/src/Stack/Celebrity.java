package Stack;

import java.util.Stack;

public class Celebrity {
    static int[][] M={{0,1,0},{0,0,0},{0,1,0}};
    public static void main(String[] args){
        int n=3;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++) st.push(i);

        while(st.size()>1){
            int a=st.pop(), b=st.pop();
            if(M[a][b]==1) st.push(b);
            else st.push(a);
        }
        int c=st.pop();
        for(int i=0;i<n;i++)
            if(i!=c && (M[c][i]==1 || M[i][c]==0)){
                System.out.println("No celebrity"); return;
            }
        System.out.println("Celebrity is "+c);
    }
}

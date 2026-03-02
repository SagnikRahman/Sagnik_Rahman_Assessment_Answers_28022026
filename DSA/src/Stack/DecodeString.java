package Stack;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args){
        String s="3[a2[c]]";
        Stack<Integer> count=new Stack<>();
        Stack<String> res=new Stack<>();
        String cur="";
        int k=0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)) k=k*10+(c-'0');
            else if(c=='['){
                count.push(k); res.push(cur);
                cur=""; k=0;
            } else if(c==']'){
                String tmp=cur;
                cur=res.pop();
                int times=count.pop();
                while(times-- >0) cur+=tmp;
            } else cur+=c;
        }
        System.out.println(cur);
    }
}

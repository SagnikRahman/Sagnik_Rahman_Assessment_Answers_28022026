package Stack;

import java.util.*;

public class StackUsingQueue {
    static Queue<Integer> q=new LinkedList<>();

    public static void main(String[] args){
        push(10); push(20);
        System.out.println(pop());
    }
    static void push(int x){
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
            q.add(q.remove());
    }
    static int pop(){
        return q.remove();
    }
}

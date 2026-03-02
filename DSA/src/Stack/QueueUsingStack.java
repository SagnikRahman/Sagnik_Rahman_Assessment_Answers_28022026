package Stack;

import java.util.*;

public class QueueUsingStack {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();

    public static void main(String[] args){
        enqueue(1); 
        enqueue(2);
        System.out.println(dequeue());
    }
    static void enqueue(int x) { 
    	s1.push(x); 
    }
    static int dequeue(){
        if(s2.isEmpty())
            while(!s1.isEmpty())
                s2.push(s1.pop());
        return s2.pop();
    }
}

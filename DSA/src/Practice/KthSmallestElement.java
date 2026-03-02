package Practice;

import java.util.HashSet;
import java.util.PriorityQueue;

// Kth Smallest Elements with duplicate values using HashSet and Priority Queue
public class KthSmallestElement {
 
    public static int kthSmallestElement(int[] arr, int k) {
    	HashSet<Integer> hs = new HashSet<>();
    	for(int num: arr) {
    		if(!hs.contains(num))
    			hs.add(num);
    	}
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : hs) {
            pq.offer(num);
        }
        int ans = -1;
        for (int i = 0; i < k; i++) {
            ans = pq.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {7, 7, 10, 4, 3, 3, 20, 15};
        int k = 3;
        System.out.println(kthSmallestElement(arr, k));
    }
}
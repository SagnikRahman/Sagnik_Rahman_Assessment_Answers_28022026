package Practice;

import java.util.PriorityQueue;
import java.util.Collections;

public class KthLargest {
    
	public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            maxHeap.add(num);
        }
        for (int i = 1; i < k; i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 2;
        System.out.println(kthLargest(arr, k));
    }
}

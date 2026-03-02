package Practice;

import java.util.HashMap;

public class Solution {
	public int defected(char ch[]) {
		int occ = -1;
//		for (int i = 0; i < ch.length; i++) {
//			if(ch[i]=='F') {
//				occ = i;
//				break;
//			}
//		}
//		return occ;
		int start = 0;
		int end = ch.length - 1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(ch[mid]=='F') {
				occ = mid;
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return occ;
	} 
	public static void main(String[] args) {
		char ch[]= {'P','P','P','P','F','F','F','F','F'};
		Solution sol = new Solution();
		System.out.println(sol.defected(ch));
	}
}

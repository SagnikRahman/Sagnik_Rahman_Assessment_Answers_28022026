package com.junit;

import java.util.Arrays;

public class Junit {
	public boolean reverse(String str) {
		String st = "";
		for(int i=str.length()-1;i>=0;i--) {
			st+=str.charAt(i);
		}
		if(str.equals(st))
			return true;
		else 
			return false;
	}

	public boolean isPrime(int num) {
	    if (num <= 1) {
	        return false;
	    }

	    for (int i = 2; i * i <= num; i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}

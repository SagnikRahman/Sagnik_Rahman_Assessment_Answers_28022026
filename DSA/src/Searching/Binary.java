package Searching;

import java.util.Scanner;

public class Binary {
	public static int binarySearch(int arr[], int l, int r, int x) {
		if (l > r)
			return -1;
		int mid = (l+r)/2;
		if (arr[mid] == x)
			return mid;
		else if(arr[mid] > x)
			return binarySearch(arr, l, mid-1, x);
		else
			return binarySearch(arr, mid+1, r, x);
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = input.nextInt();
		System.out.println("Enter the elements: ");
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Enter the element to be searched: ");
		int element = input.nextInt();
		int pos = binarySearch(arr, 0, size-1, element);
		if(pos != -1)
			System.out.println(element + " found at position " + pos);
		else
			System.out.println(element + " not found");
	}
}

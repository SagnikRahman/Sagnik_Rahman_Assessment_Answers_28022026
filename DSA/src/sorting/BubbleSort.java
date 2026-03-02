package sorting;
import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = input.nextInt();
		System.out.println("Enter the elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) 
        	arr[i] = input.nextInt();
        bubbleSort(arr);
        System.out.println("The sorted array: ");
        for (int x : arr) 
        	System.out.print(x + " ");
        input.close();
    }
}

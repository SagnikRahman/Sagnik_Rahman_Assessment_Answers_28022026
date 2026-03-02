package basics;

public class ArrayOperation {
	public static void main(String[] args) {
		int arr[] = {10, 5, 30, 6, 8, 20};
		int pos = 3;
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Minimum element: " + min);
		System.out.println("Maximum element: " + max);
	}
}

package basics;

public class RotateArray {
	public static void main(String[] args) {
		int arr[] = {10, 5, 30, 6, 8, 20};
		int pos = 3;
		int n = arr.length;
        for (int i = 0; i < pos; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
		for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
		}
	}
}

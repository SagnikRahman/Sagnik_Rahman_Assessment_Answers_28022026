package Practice;

public class BitonicArrayMax {
	public static int findMax(int arr[]) {
		int low = 0;
		int high = arr.length - 1;
		while(low < high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] < arr[mid+1]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return arr[low];
	}
	public static void main(String[] args) {
		int arr[] = {1, 4, 9, 14, 8, 6, 3};
		System.out.println("Bitonic Array Max: " + findMax(arr));
	}
}

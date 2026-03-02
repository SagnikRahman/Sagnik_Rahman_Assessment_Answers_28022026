package basics;

public class ElementDeletionPos {
	public static void main(String[] args) {
        int arr[] = {10, 5, 30, 6, 8, 20};
        int pos = 2; 
        for (int i = pos; i < arr.length - 1; i++) {
        	arr[i] = arr[i + 1];
        }
        System.out.println("The modified array: ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
		} 
    }
}

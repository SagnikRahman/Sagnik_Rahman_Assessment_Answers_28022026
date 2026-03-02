package basics;

public class ElementDeletion {
    public static void main(String[] args) {
        int arr[] = {10, 5, 30, 6, 8, 30};
        int element = 30; 
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != element) {
                arr[count++] = arr[i]; 
            }
        }
        System.out.println("The modified array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        } 
    }
}
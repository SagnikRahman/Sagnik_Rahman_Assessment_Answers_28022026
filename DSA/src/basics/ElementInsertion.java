package basics;

public class ElementInsertion {
    public static void main(String[] args) {
        int arr[] = {10, 5, 6, 8, 20};
        int pos = 2; 
        int element = 30;
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < pos) 
                newArr[i] = arr[i];
            else if (i == pos)
                newArr[i] = element;
            else
                newArr[i] = arr[i - 1];
        }
        System.out.println("The modified array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
		} 
    }
}

package ArrayPractice;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {5,3,8,2};
        int key = 8;
        int pos = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                pos = i;
                break;
            }
        }
        if(pos == -1)
        	System.out.println("Element not found");
        else
        	System.out.println("Element found at position " + pos);
    }
}

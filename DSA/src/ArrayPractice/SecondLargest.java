package ArrayPractice;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {10,20,5,8};
        int largest = a[0];
        int second = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }
        System.out.println(second);
    }
}

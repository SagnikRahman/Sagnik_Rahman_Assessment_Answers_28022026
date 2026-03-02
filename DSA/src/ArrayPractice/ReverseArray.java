package ArrayPractice;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

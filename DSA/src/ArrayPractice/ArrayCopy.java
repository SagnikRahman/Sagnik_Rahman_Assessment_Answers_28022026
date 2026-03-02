package ArrayPractice;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}

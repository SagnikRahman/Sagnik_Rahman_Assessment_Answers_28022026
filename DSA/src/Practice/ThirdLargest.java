package Practice;

import java.util.Scanner;

public class ThirdLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int len = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println("3rd Largest Element: " + third);
        sc.close();
    }
}

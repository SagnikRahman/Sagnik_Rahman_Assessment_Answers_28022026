package Practice;

import java.util.Scanner;

public class Sum2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[rows][cols];
        int sum = 0;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}

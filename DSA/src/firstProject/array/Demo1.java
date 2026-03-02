package firstProject.array;

import java.util.Scanner;

public class Demo1 {
	
	public static boolean isColumnMatrix(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 1) {
                return false;
            }
        }
        return true;
    }
	
    public static void main(String[] args) {
        int[][] array = {{1},{3},{5}};

        if (isColumnMatrix(array)) {
            System.out.println("The matrix is a column matrix");
        } else {
            System.out.println("The matrix is not a column matrix");
        }
    }

}
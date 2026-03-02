package basics;

public class ArrayProg {
	public static void main(String[] args) {
		int arr[] = new int[10];	
		int arr1[] = {1,5,8,2};		
		int arr2[] = arr1;			
		
		int twoD[][] = new int[3][3];
		int twoDarr[][] = { { 1 , 2 }, { 4 , 8 } };
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for (int i = 0; i < twoDarr.length; i++) {
			for (int j = 0; j < twoDarr[0].length; j++) {
				System.out.print(twoDarr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

package Thread;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Program started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter num2:");
		int num2 = sc.nextInt();
		System.out.println(num1+num2);
		System.out.println("Program finished");
		
		System.out.println("Printing characters");
		for (int i = 65; i <= 75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Printing numbers");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

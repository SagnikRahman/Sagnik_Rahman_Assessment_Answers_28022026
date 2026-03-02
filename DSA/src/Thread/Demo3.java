package Thread;

import java.util.Scanner;

class P1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Program started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter num2:");
		int num2 = sc.nextInt();
		System.out.println(num1+num2);
		System.out.println("Program finished");
		sc.close();
	}
}

class P2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Printing characters");
		for (int i = 65; i <= 75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class P3 implements Runnable {
	@Override
	public void run() {
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

public class Demo3 {
	public static void main(String[] args) {
		P1 p1 = new P1();
		P2 p2 = new P2();
		P3 p3 = new P3();
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

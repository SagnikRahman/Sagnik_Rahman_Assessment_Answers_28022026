package Thread;

import java.util.Scanner;

class D1 extends Thread {
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

class D2 extends Thread {
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

class D3 extends Thread {
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

public class Demo2 {
	public static void main(String[] args) {
		D1 t1 = new D1();
		D2 t2 = new D2();
		D3 t3 = new D3();
		// sequentially the threads are running
//		t1.run();
//		t2.run();
//		t3.run();
		
		//now the threads will run simultaneously
		t1.start();
		t2.start();
		t3.start();
		
	}
}

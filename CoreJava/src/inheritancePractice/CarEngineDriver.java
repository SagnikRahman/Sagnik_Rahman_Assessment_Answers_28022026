package inheritancePractice;

import java.util.Scanner;

public class CarEngineDriver extends Car{
	public static void main(String[] args) {
		Car car = new Car();
		car.engine = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice of engine to attach: ");
		System.out.println("1. Petrol Engine");
		System.out.println("2. Diesel Engine");
		byte input = sc.nextByte();
		sc.nextLine();
		switch (input) {
		case 1: 
			System.out.println(car.engine.getClass());
		case 2: 
			System.out.println(car.engine.getClass());
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}
}

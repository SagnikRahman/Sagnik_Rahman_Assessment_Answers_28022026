package non_primitive_typecasting;

import java.util.Scanner;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("Which engine to fit: ");
		System.out.println("1. Petrol Engine: ");
		System.out.println("2. Diesel Engine: ");
		System.out.println("Enter your choice: ");
		byte b = sc.nextByte();
		sc.nextLine();
		Engine engine = null;
		switch(b) {
		case 1:
			PetrolEngine petrolEngine = new PetrolEngine();
			engine = petrolEngine;
			break;
		case 2:
			DieselEngine dieselEngine = new DieselEngine();
			engine = dieselEngine;
			break;
		default:
			PetrolEngine petrolEngine1 = new PetrolEngine();
			engine = petrolEngine1;
			break;
			
		}
		car.engine = engine;
//		System.out.println("Engine in car: "+ car.engine.getClass());
//		engine.startEngine();
		switch (b) {
		case 1:
			PetrolEngine petrolEngine = (PetrolEngine)engine;
			petrolEngine.startEngine();
			break;
		case 2:
			DieselEngine dieselEngine = (DieselEngine)engine;
			dieselEngine.startEngine();
			break;

		default:
			PetrolEngine petrolEngine1 = (PetrolEngine)engine;
			petrolEngine1.startEngine();
			break;
		}
	}
}

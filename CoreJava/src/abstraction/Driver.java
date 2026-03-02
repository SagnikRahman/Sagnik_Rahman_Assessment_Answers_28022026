package abstraction;

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
			engine = new PetrolEngine();
			PetrolEngine petrolEngine = (PetrolEngine)engine;
			petrolEngine.startEngine();
			break;
		case 2:
			engine = new DieselEngine();
			DieselEngine dieselEngine = (DieselEngine)engine;
			dieselEngine.startEngine();
			break;
		default:
			engine = new PetrolEngine();
			PetrolEngine petrolEngine1 = (PetrolEngine)engine;
			petrolEngine1.startEngine();
			break;
			
		}
		car.engine = engine;
	}
}

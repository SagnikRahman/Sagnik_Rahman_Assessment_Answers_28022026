package has_a.bi;

public class DriverClass {
	public static void main(String[] args) {
		Car car = new Car(); //car created
		Engine engine = new Engine(); //engine created
		car.engine = engine; //engine assigned to car
		System.out.println(car.col);
		System.out.println(car.engine);
		System.out.println(car.engine.noOfCyl);
		engine.car = car; //car assigned to engine
		System.out.println(engine.noOfCyl);
		System.out.println(engine.car);
		System.out.println(engine.car.col);
		
	}
}

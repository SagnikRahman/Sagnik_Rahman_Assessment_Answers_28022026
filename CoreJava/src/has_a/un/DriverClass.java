package has_a.un;

public class DriverClass {
	public static void main(String[] args) {
		Engine e = new Engine();//engine created
		System.out.println(e.noOfCyl);
		Car c = new Car();//car created
		c.engine = e; //fixing engine inside car
		System.out.println(c.col);
		System.out.println(c.engine.noOfCyl);
		
	}
}

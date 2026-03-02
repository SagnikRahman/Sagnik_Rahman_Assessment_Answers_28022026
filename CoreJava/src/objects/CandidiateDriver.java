package objects;

public class CandidiateDriver {

	public static void main(String[] args) {
		Candidate c1 = new Candidate("Sagnik",1234567890L,true);
		System.out.println(c1.name);
		System.out.println(c1.mobileNumber);
		System.out.println(c1.gender);
		
	}

}

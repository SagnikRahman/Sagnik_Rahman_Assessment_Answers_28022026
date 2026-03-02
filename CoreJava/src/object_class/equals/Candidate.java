package object_class.equals;

public class Candidate {
	int id;
	String name;
	
	Candidate(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + ", name: " + this.name;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) return true;
//		if (obj == null || getClass() != obj.getClass()) return false;
//		Candidate c = (Candidate) obj;
//		return this.id == c.id;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			System.out.println("Returning true from 1st if block");
			System.out.println("As both ref. are same");
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			System.out.println(getClass());
//			System.out.println(obj.getClass());
			System.out.println("Returning true from 2st if block");
			System.out.println("As 1 of ref. is null OR both ref. are of diff type");
			return false;
		}
		Candidate c = (Candidate) obj;
		if(this.id == c.id) {
			return true;
		}
		return false;
	}
}

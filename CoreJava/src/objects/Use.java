package objects;

public class Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User("sagnik@gmail.com","1234");
		User u2 = new User("sagnik15@gmail.com","12345","Salt Lake");
		System.out.println(u1.email);
		System.out.println(u1.password);
		System.out.println(u1.address);
		System.out.println(u2.email);
		System.out.println(u2.password);
		System.out.println(u2.address);
	}

}

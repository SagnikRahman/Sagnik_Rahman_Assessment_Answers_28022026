package transaction_system;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM();

		while (true) {
			try {
	            System.out.print("Enter PIN: ");
	            atm.authenticate(sc.nextInt());
	            sc.close();
	            return;
	            
	        } catch (InvalidPinException e1) {
	        	System.out.println(e1.getMessage());
	            try {
	                System.out.print("Enter PIN: ");
	                atm.authenticate(sc.nextInt());
	                sc.close();
		            return;

	            } catch (InvalidPinException e2) {
		        	System.out.println(e2.getMessage());

	                try {
	                    System.out.print("Enter PIN: ");
	                    atm.authenticate(sc.nextInt());
	                    sc.close();
	    	            return;

	                } catch (InvalidPinException e3) {
			        	System.out.println(e3.getMessage());
	                    System.out.println("Limit reached. Access not allowed.");
	                    break;
	                }
	            }
	        }
     	}
 	}
}

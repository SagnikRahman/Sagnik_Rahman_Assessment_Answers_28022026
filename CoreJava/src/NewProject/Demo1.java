package NewProject;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter the month's number: ");
		int numMonth = myInput.nextInt();
		myInput.nextLine();
		switch(numMonth)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("The month has 31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("The month has 30 days");
			break;
		case 2:
			System.out.println("Enter the year: ");
			int year = myInput.nextInt();
			myInput.nextLine();
			if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0))
				System.out.println("The month has 29 days");
			else
				System.out.println("The month has 28 days");
			break;
		}
		
	}
	
}

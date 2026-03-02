package NewProject;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("Enter first operand: ");
			double num1 = sc.nextDouble();
			System.out.println("Enter operation to be performed: ");
			char oper = sc.next().charAt(0);
			System.out.println("Enter second operand: ");
			double num2 = sc.nextDouble();
			sc.nextLine();
			switch(oper)
			{
			case '+':
				System.out.println("Result: " + add(num1,num2));
				break;
			case '-':
				System.out.println("Result: " + subtract(num1,num2));
				break;
			case '*':
				System.out.println("Result: " + multiply(num1,num2));
				break;
			case '/':
				System.out.println("Result: " + divide(num1,num2));
				break;
			default:
				System.out.println("Invalid operation");
			}
			System.out.println("Do you wish to continue...(Y/N)");
			ch = sc.next().charAt(0);
			sc.nextLine();
		} while (ch == 'Y');
		System.out.println("Exiting...");
	}
	
	public static double add(double a, double b)
	{
		double sum = a + b;
		return sum;
	}
	public static double subtract(double a, double b)
	{
		double diff = a - b;
		return diff;
	}
	public static double multiply(double a, double b)
	{
		double prod = a * b;
		return prod;
	}
	public static double divide(double a, double b)
	{
		double quo = a / b;
		return quo;
	}

}

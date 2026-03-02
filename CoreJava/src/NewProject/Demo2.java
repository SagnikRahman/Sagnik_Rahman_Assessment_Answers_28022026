package NewProject;

import java.util.Scanner;

public class Demo2 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		do {
			Expression exp = inputs();
			System.out.println("op1: " + exp.operand1);
			System.out.println("op: " + exp.operator);
			System.out.println("op2: " + exp.operand2);
			
			switch (exp.operator) {
			case '+': 
				addition(exp);
				break;
			case '-': 
				
				break;
			case '*': 
				
				break;
			case '/': 
				
				break;
			default:
				System.out.println("Invalid Operator");
				break;
			}
			toContinue();
			
		} while (true);
	}
	
	public static Expression inputs() {
		Expression exp = new Expression();
		System.out.print("Enter operand1: ");
		exp.operand1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter operator: ");
		exp.operator = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Enter operand2: ");
		exp.operand2 = sc.nextDouble();
		sc.nextLine();
		return exp;
	}
	
	public static void toContinue() {
		System.out.print("To continue enter 'y' : ");
		char selection = sc.next().charAt(0);
		if(selection!='y') {
			System.out.println("----EXITING----");
			System.exit(0);
		}
	}
	
	public static void addition(Expression exp) {
		System.out.print(exp.operand1 + exp.operand2);
	}

}

class Expression {
	double operand1, operand2;
	char operator;
}

package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Memo {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            // 1. Get values in a Collection
            ArrayList<Double> list = inputs();
            
            // 2. Convert Collection to Array
            // We use a manual loop or Java 8+ stream to get a primitive double[]
            double[] numbers = new double[list.size()];
            for (int i = 0; i < list.size(); i++) {
                numbers[i] = list.get(i);
            }
            
            // 3. Call operations using the array
            switch (op) {
                case '+': addition(numbers); break;
                case '-': subtraction(numbers); break;
                case '*': multiplication(numbers); break;
                case '/': division(numbers); break;
                default: System.out.println("Invalid Operator"); break;
            }
            
            System.out.println();
            toContinue();
            
        } while (true);
    }
    
    public static ArrayList<Double> inputs() {
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Enter numbers (type any non-number like 'd' to finish):");
        
        while (sc.hasNextDouble()) {
            list.add(sc.nextDouble());
        }
        sc.next(); // Clear the non-number input (the sentinel)
        return list;
    }
    
    public static void toContinue() {
        System.out.print("To continue enter 'y' : ");
        char selection = sc.next().charAt(0);
        if(selection != 'y') {
            System.out.println("----EXITING----");
            System.exit(0);
        }
    }


    public static void addition(double[] values) {
        double sum = 0;
        for (double val : values) sum += val;
        System.out.println("Result: " + sum);
    }

    public static void subtraction(double[] values) {
        if (values.length == 0) return;
        double result = values[0];
        for (int i = 1; i < values.length; i++) result -= values[i];
        System.out.println("Result: " + result);
    }

    public static void multiplication(double[] values) {
        if (values.length == 0) return;
        double result = 1;
        for (double val : values) result *= val;
        System.out.println("Result: " + result);
    }

    public static void division(double[] values) {
        if (values.length == 0) return;
        double result = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] == 0) {
                System.out.println("Error: Division by zero");
                return;
            }
            result /= values[i];
        }
        System.out.println("Result: " + result);
    }
}
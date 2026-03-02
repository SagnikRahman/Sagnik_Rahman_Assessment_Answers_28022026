package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Calc {

    public static double add(double... nums) {
        double sum = 0;
        for (double n : nums) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter expression (e.g., 2+3+4=): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit"))
                break;

            ArrayList<Double> list = new ArrayList<>();
            String tempNumber = "";

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (Character.isDigit(c) || c == '.') {
                    tempNumber += c;
                } else if (c == '+' || c == '=') {
                    if (!tempNumber.isEmpty()) {
                        list.add(Double.parseDouble(tempNumber));
                        tempNumber = "";
                    }
                }
            }

            double[] nums = new double[list.size()];
            for (int i = 0; i < list.size(); i++) {
                nums[i] = list.get(i);
            }

            double result = add(nums);
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}

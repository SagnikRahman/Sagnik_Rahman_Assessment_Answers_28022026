package Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            minimumStack ms = new minimumStack();
            for (int i = 0; i < n; i++) {
                String op = sc.next();
                if (op.equals("push")) {
                    int val = sc.nextInt();
                    ms.addValue(val);
                }
                else if (op.equals("pop")) {
                    ms.removeTopValue();
                }
                else if (op.equals("top")) {
                    ms.getTopValue();
                }
                else if (op.equals("getMin")) {
                    ms.getMinimumValue();
                }
            }
        }
        sc.close();
    }
}

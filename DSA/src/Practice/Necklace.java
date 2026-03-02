package Practice;

import java.util.*;

public class Necklace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder out = new StringBuilder();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            k = k % n;
            for (int i = k; i < n; i++)
                out.append(a[i]).append(" ");
            for (int i = 0; i < k; i++)
                out.append(a[i]).append(" ");
            out.append("\n");
        }
        System.out.print(out);
    }
}
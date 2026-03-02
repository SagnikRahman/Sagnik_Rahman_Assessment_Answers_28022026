package Practice;

import java.util.*;

public class StackSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder res = new StringBuilder();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            if (canBeSorted(A, N))
                res.append("YES\n");
            else
            	res.append("NO\n");        
        }
        System.out.print(res);
        sc.close();
    }

    public static boolean canBeSorted(int[] A, int N) {
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        for (int x : A) {
            stack.push(x);
            while (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                num++;
            }
        }
        while (!stack.isEmpty() && stack.peek() == num) {
            stack.pop();
            num++;
        }
        return stack.isEmpty();
    }
}

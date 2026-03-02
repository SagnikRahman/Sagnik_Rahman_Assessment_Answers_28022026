package Practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StonePile {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T--> 0) {
            int N = sc.nextInt();
            Deque<Integer> pile = new ArrayDeque<>();
            for (int i = 0; i < N; i++)
                pile.addLast(sc.nextInt());
            boolean amanTurn = true;
            int lastPlayer = 1;
            while (pile.size() > 1) {
                if (amanTurn) {
                    pile.addLast(pile.pollFirst());
                    pile.pollFirst();
                    lastPlayer = 1;
                } else {
                    for (int i = 0; i < 2 && pile.size() > 1; i++)
                        pile.addLast(pile.pollFirst());
                    pile.pollFirst();
                    lastPlayer = 0;
                }
                amanTurn = !amanTurn;
            }
            System.out.println(lastPlayer + " " + pile.peekFirst());
        }
        sc.close();
    }
}

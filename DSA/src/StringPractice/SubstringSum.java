package StringPractice;

public class SubstringSum {
    public static void main(String[] args) {
        String s = "abc";
        int k = 5;
        for (int i = 0; i < s.length(); i++) {
            int sum = 0;
            for (int j = i; j < s.length(); j++) {
                sum += (s.charAt(j) - 'a' + 1);
                if (sum == k) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}

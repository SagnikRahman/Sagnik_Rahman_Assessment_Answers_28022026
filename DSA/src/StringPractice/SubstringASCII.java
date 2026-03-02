package StringPractice;

public class SubstringASCII {
    public static void main(String[] args) {
        String s = "ABCD";
        int k = 135;
        for (int i = 0; i < s.length(); i++) {
            int sum = 0;
            for (int j = i; j < s.length(); j++) {
                sum += s.charAt(j);
                if (sum == k) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}

package StringPractice;

public class StringLength {
    public static void main(String[] args) {
        String s = "Hello";
        int len = 0;
        for (char c : s.toCharArray()) {
            len++;
        }
        System.out.println(len);
    }
}

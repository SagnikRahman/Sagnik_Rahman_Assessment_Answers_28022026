package StringPractice;

public class CharCount {
    public static void main(String[] args) {
        String s = "Hello World";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println(count);
    }
}
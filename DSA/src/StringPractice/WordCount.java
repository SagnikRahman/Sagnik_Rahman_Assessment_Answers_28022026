package StringPractice;

public class WordCount {
    public static void main(String[] args) {
        String s = "Java Programming";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                count++;
        }
        System.out.println(count);
    }
}

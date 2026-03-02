package StringPractice;

public class UpperLower {
    public static void main(String[] args) {
        String s = "Java";
        String upper = "";
        String lower = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                upper += (char)(c - 32);
            else
                upper += c;
            if (c >= 'A' && c <= 'Z')
                lower += (char)(c + 32);
            else
                lower += c;
        }
        System.out.println("upper: " + upper);
        System.out.println("lower: " + lower);
    }
}

package StringPractice;

public class VowConCount {
    public static void main(String[] args) {
        String s = "Education";
        s = s.toLowerCase();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels++;
            else
                consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

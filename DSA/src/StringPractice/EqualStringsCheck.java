package StringPractice;

public class EqualStringsCheck {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        boolean equal = true;
        if (a.length() != b.length())
            equal = false;
        else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }
        if(equal) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}

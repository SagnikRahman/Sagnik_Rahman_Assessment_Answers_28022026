package StringPractice;

public class BinaryString {
    public static void main(String[] args) {
        String s = "10101";
        boolean binary = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                binary = false;
                break;
            }
        }
        if(binary) {
        	System.out.println("binary string");
        } else {
        	System.out.println("not binary string");
        }
    }
}

package demo_package;

import java.util.Scanner;

import java.util.Arrays;

public class CheckAnagram {

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter word1: ");
    	String word1=sc.next();
    	sc.nextLine();
    	System.out.print("Enter word2: ");
    	String word2=sc.next();
    	sc.nextLine();
        if (isAnagram(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams");
        } else {
            System.out.println(word1 + " and " + word2 + " are NOT anagrams");
        }
    }
}
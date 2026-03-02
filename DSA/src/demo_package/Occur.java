package demo_package;

public class Occur {

    public static void main(String[] args) {
        String input = "beautiful";
        
        int[] totalCounts = countFrequencies(input);
        
        printOccurrences(totalCounts);
        
        String transformed = transformString(input, totalCounts);
        System.out.println("Transformed Result: " + transformed);
    }

    public static int[] countFrequencies(String input) {
        int[] counts = new int[256];
        for (int i = 0; i < input.length(); i++) {
            counts[input.charAt(i)]++;
        }
        return counts;
    }

    public static String transformString(String input, int[] totalCounts) {
        StringBuilder result = new StringBuilder();
        int[] currentCount = new int[256];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            currentCount[c]++;

            if (totalCounts[c] > 1) {
                int timesToAdd = currentCount[c] + 1;
                for (int j = 0; j < timesToAdd; j++) {
                    result.append(c);
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void printOccurrences(int[] totalCounts) {
        System.out.println("Character Occurrences:");
        for (int i = 0; i < totalCounts.length; i++) {
            if (totalCounts[i] > 0) {
                System.out.println((char) i + ": " + totalCounts[i]);
            }
        }
    }
}
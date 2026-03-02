package wrapper;

public class Demo1 {
    public static void main(String[] args) {
        String input = "qwer2ty9"; 
        byte parseByte;

        try {
            System.out.println("Trying to parse: " + input);
            parseByte = Byte.parseByte(input);
            System.out.println("Successfully Parsed Result: " + parseByte);
            
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
            
            String cleanedInput = input.replaceAll("[^0-9]", "");
            
            if (cleanedInput.isEmpty()) {
                System.out.println("Error: Not a number");
            } else {
                try {
                	parseByte = Byte.parseByte(cleanedInput);
                    System.out.println("Cleaned and Parsed Result: " + parseByte);
                } catch (NumberFormatException ex) {
                    System.out.println("Error: The cleaned number is out of byte range.");
                }
            }
        }
    }
}
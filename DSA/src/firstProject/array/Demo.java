package firstProject.array;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        boolean[] booleanArray = {true, false, true};
        char[] charArray = {'a', 'e', 'i'};
        Object[] objectArray = {1234567890L, "string", 'l'};
        int num = 25;
        arrayPrinter(booleanArray); 
        arrayPrinter(charArray);
        arrayPrinter(objectArray);
        arrayPrinter(num);
    }

    public static void arrayPrinter(Object... array) {
        for (Object arr : array) {
            if (arr instanceof boolean[]) {
                System.out.println(Arrays.toString((boolean[]) arr));
            } 
            else if (arr instanceof char[]) {
                System.out.println(Arrays.toString((char[]) arr));
            } 
            else if (arr instanceof Object[]) {
                System.out.println(Arrays.toString((Object[]) arr));
            }
            else {
                System.out.println(arr);
            }
        }
    }
}
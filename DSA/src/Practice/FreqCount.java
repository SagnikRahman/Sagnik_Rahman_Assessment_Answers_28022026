package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqCount {

    public static void main(String[] args) {

        List<String> l = Arrays.asList("book", "pen", "copy", "book");

        Map<String, Integer> map = new HashMap<>();

        for (String word : l) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
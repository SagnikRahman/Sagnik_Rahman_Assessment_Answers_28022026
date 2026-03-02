package functional_interface;

import java.util.*;
import java.util.function.Function;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(1);

        Function<ArrayList<Integer>, HashSet<Integer>> c1 = (l) -> new HashSet<>(l);
        Function<ArrayList<Integer>, HashSet<Integer>> c2 = HashSet::new;

        HashSet<Integer> set = c1.apply(list);
        System.out.println(set);
        
        Function<ArrayList<Integer>, TreeSet<Integer>> c3 = (l) -> new TreeSet<>(l);
        System.out.println(c3.apply(list));
    }
}

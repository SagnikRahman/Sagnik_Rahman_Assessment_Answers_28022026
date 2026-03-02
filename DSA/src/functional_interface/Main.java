package functional_interface;

import java.util.function.BiFunction;

class Calc {

    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calc c1 = new Calc();

        BiFunction<Integer, Integer, Integer> f1 = (a,b) -> Calc.multiply(a, b);
        BiFunction<Integer, Integer, Integer> f2 = Calc::multiply;
        System.out.println(f2.apply(4, 5));
    }
}

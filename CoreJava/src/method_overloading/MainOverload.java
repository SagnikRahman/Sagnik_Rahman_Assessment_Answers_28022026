package method_overloading;

public class MainOverload {

    public static void main(String[] args) {
        System.out.println("Original main method");
        main(10);
        main("Hello");
    }

    public static void main(int x) {
        System.out.println("Overloaded main with int: " + x);
    }

    public static void main(String msg) {
        System.out.println("Overloaded main with String: " + msg);
    }
}

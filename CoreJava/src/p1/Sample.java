package p1;

class Sample {
    static int a = 10;

    static void show() {
        System.out.print(a++ + " ");
    }

    public static void main(String[] args) {
        show();
        show();
    }
}

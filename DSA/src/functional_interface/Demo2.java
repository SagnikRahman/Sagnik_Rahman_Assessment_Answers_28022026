package functional_interface;

interface A {
    void show(String msg);
}

public class Demo2 {

    public void show(String msg) {
        msg = msg.toLowerCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {

    	Demo2 d = new Demo2();
        A a1 = (msg) -> d.show(msg);
        A a2 = d::show;

        a1.show("HELLO WORLD");
        a2.show("HELLO JAVA");

    }
}

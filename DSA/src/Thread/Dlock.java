package Thread;

class A {
	synchronized void methodA(B b) {
		System.out.println("Thread 1 holding A");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		
		System.out.println("Thread 1 waiting for B");
		b.last();
	}
	
	synchronized void last() {
		System.out.println("Inside A last()");
	}
}

class B {
	synchronized void methodB(A a) {
		System.out.println("Thread 2 holding B");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		
		System.out.println("Thread 2 waiting for A");
		a.last();
	}
	
	synchronized void last() {
		System.out.println("Inside B last()");
	}
}

public class Dlock {
	public static void main(String[] args) {
		A a  = new A();
		B b  = new B();
		
		Thread t1 = new Thread() {
			public void run() {
				a.methodA(b);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				b.methodB(a);
			}
		};
		
		t1.start();
		t2.start();
	}
}




//Resolution of the deadlock

//
//package Thread;
//
//class A {
//    void methodA(B b) {
//        synchronized (this) {   // Lock A first
//            System.out.println("Thread holding A");
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {}
//
//            synchronized (b) {  // Then lock B
//                System.out.println("Thread acquired B after A");
//                b.last();
//            }
//        }
//    }
//
//    void last() {
//        System.out.println("Inside A last()");
//    }
//}
//
//class B {
//    void methodB(A a) {
//        synchronized (a) {   // Lock A first
//            System.out.println("Thread holding A");
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {}
//
//            synchronized (this) {   // Then lock B
//                System.out.println("Thread acquired B after A");
//                last();
//            }
//        }
//    }
//
//    void last() {
//        System.out.println("Inside B last()");
//    }
//}
//
//public class Demo4 {
//    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//
//        Thread t1 = new Thread() {
//            public void run() {
//                a.methodA(b);
//            }
//        };
//
//        Thread t2 = new Thread() {
//            public void run() {
//                b.methodB(a);
//            }
//        };
//
//        t1.start();
//        t2.start();
//    }
//}
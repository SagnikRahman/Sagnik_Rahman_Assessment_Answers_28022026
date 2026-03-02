package Thread;

class Demo20 implements Runnable {
	
	int count = 0;
	synchronized public void show() {
		count++;
	}
	@Override
	public void run() {
		for(int i=0;i<500;i++) {
			show();
		}
	}
}
public class SyncDemo {
	public static void main(String[] args) {
		Demo20 d1 = new Demo20();
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(d1.count);
	}
}

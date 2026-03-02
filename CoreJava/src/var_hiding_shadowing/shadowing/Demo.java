package var_hiding_shadowing.shadowing;

class Demo {
	int x = 1;
	static int y = 40;
	void show() {
		int x = 2;
		int y = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(Demo.y);
	}
	public static void main(String args[]) {
		Demo d = new Demo();
		d.show();
	}
}


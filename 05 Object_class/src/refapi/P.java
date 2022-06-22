package refapi;

class P1 {
	static void test() {
		System.out.println("from test()");
	}

	void test2() {
		System.out.println("from test2()");
	}
}

public class P {
	public static void main(String[] args) {
		P1.test();

		P1 p = new P1();
		p.test2();
	}
}

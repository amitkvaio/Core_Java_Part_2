package sec;

abstract class O {
	abstract protected void test();
}

class P extends O {
	public void test() {
		System.out.println("from test");
	}

	public static void main(String[] args) {
		P p = new P();
		p.test();
		System.out.println("done");
	}
}
//while implementing the test() method it should be the protected or public.
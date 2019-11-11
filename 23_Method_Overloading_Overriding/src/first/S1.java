package first;

class S1 {
	void test() {
		System.out.println("from S");
	}
}

class T1 extends S1 {
	@Override
	void test() {
		System.out.println("from amit");
	}

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.test();
		System.out.println("done");
	}
}

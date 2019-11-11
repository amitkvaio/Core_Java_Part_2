package first;

class S {
	void test() {
		System.out.println("from S");
	}
}

class T extends S {

	public static void main(String[] args) {
		T t1 = new T();
		t1.test();
		System.out.println("done");
	}
}

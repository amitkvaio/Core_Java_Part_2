package first;

class U {
	void test() {
		System.out.println("from  u class test()");
	}
}

class V extends U {
	void test() {
		System.out.println("from v class test method");
	}

	public static void main(String[] args) {
		V obj = new V();
		obj.test();
	}
}
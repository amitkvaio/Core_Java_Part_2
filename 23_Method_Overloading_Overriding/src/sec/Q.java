package sec;

interface Q {
	void test();
}

class R implements Q {
	public void test() {
		System.out.println("from test");
	}
}
//while implementing the interface method public keyword is required.
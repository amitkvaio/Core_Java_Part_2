package over;

interface C {
	void test1(int i);
}

abstract class D implements C {
	public void test1() {
		System.out.println("from test1");
	}

	/*@Override
	public void test1(int i) {
		System.out.println("from test1(int i)");

	}*/
}

/*
test1(int i) is inherit into the class D , but not implements inside the class D so 
CLASS should be declared as abstract.
cte

*/
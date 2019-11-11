package over;

abstract class A {
	abstract void test1();
}

abstract class B extends A {
	// test1() method is not inherited inside the class B
	void test1(double b)// Concrete method
	{
		System.out.println("from testi double");
	}
}

class C1 extends B {
	// class A test1()and Class B test1() both are inherit into the class C1
	void test1() {
		System.out.println("from test1 of class A");
	}

	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.test1();
		c1.test1(10.10);
	}
}

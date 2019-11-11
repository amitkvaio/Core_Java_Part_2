
class B
{
	class C
	{
		void testC() {
			System.out.println("from testC");
		}
	}
	static class D
	{
		void testD() {
			System.out.println("from testD");
		}
	}
	
	void test1()
	{
		C c1 = new C();
		D d1 = new D();
		test2();
	}
	
	static void test2()
	{
		//C c1  = new C();//non-static class
		D d1 = new D();
		d1.testD();
		//test1();//non-static method
		B b1 =  new B();
		b1.test1();
	}
}

/*
inside the static block we can use only static member of the current class.

*/
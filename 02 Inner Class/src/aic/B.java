package aic;

abstract class B
{
	abstract void test1();
	
	void test2()
	{
		System.out.println("B-test2()");
	}
	
	public B() {
		System.out.println("B() - CONSTRUCTOR");
	}
}

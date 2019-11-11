package third;

public class A
{
	void test1()
	{
		System.out.println("from A-test1");
	}
	void test2()
	{
		System.out.println("from A-test2");
	}
}
class B extends A
{
	void test3()
	{
		super.test1();
		super.test2();
		this.test1();
		this.test2();
		//this.test3();//recursive calling calling it will produce RTE stack overflow error
		test1();
		test2();
	}
	void test2()//OR test2() of A class
	{
		System.out.println("from B-test2");
	}
	public static void main(String[] args)
	{
		B b = new B();
		b.test3();
		System.out.println("done");
	}
}

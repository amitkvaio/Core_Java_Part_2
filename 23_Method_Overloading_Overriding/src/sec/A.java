package sec;
abstract class A
{
	abstract int test();
}
class B extends A
{
	int test()
	{
		System.out.println("from test()");
		return 10;
	}
	public static void main(String[] args)
	{
		B b= new B();
		b.test();
		System.out.println("done");
	}
}
//if the return type is not same then it gives the cte.
//while implementing or overriding in the subclass return type should be the same
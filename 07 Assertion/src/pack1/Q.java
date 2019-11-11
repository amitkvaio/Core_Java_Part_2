package pack1;

public class Q
{
	void test()
	{
		System.out.println("test1-begin");
		assert false;
		System.out.println("test1-end");
	}
}
class R
{
	public static void main(String[] args)
	{
		System.out.println("main-begin");
		assert false;
		Q q1 = new Q();
		q1.test();
		System.out.println("main-end");
	}
}

package pract;

public class F
{
	public static void main(String[] args)
	{
		test();
		System.out.println("main end");
	}

	static void test()
	{
		System.out.println(111);
		try
		{
			System.out.println(22222);
			int i = 10 / 0;
			System.out.println(333333333);
		} catch (Exception e)
		{
			System.out.println(e);
			System.out.println(4444444);
		}
		System.out.println(5555555);
	}
}

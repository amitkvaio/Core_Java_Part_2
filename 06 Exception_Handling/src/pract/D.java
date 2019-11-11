package pract;

public class D
{
	public static void main(String[] args)
	{
		int i = test5();
		System.out.println("i=" + i);
	}

	static int test5()
	{
		try
		{
			int j = 10 / 0;
			return 20;
		} catch (ArithmeticException ex)
		{
			System.out.println(ex);
			return 30;
		} finally
		{
			return 5000;
		}
		// return 40;//unreachable stmt
	}

}

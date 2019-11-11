package pract;

public class K
{
	public static void main(String[] args)
	{
		System.out.println("main");
		try
		{
			System.out.println("try");
			int i = 10 / 0;
			System.out.println("end");
		} catch (NumberFormatException e)
		{
			e.printStackTrace();
		} finally
		{
			System.out.println("finally");
		}
		System.out.println("main end");
	}
}

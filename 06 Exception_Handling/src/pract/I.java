package pract;

public class I
{
	public static void main(String[] args)
	{
		try
		{
			int i = 0;
			i = 10 / 0;
			System.out.println("try");

		} finally
		{
			System.out.println("finally");
		}
		System.out.println("done");
	}
}

package pract;

public class C
{
	public static void main(String[] args)
	{
		System.out.println(1);
		System.out.println(2);

		try
		{
			System.out.println("try");
			int x[] = { 1, 2 };
			System.out.println(x[3]);
			// System.out.println(100);
			// System.out.println("try last");
			// not executed

		} catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("exception");
			// System.exit(0);
			// terminate the flow of the program
		} finally
		{
			System.out.println("finally");
		}
	}
}

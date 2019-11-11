package pract;

public class L
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("try");
			int i = 10/0;
		} 
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("main");
	}
}


//important
package pract;

public class A
{
	public static void main(String[] args)
	{
		try
		{
			try
			{
				int x[] = {1,2,4,5};
				System.out.println("first try");
				System.out.println(x[5]);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
			System.out.println("second try");
			
 		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}

/*
in which scenario wr have to keep try inside another try?


wherever exception is occured try to handle itself in order
to excute remaing portion of the try stmt.
*/
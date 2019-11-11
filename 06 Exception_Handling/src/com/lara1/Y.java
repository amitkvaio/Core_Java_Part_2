package com.lara1;

public class Y
{
	public static void main(String[] args)
	{
		try
		{
			int i = 10/0;
		}
		catch(ArithmeticException t)
		{
			System.out.println(t);
			System.out.println(4);
		}
		catch(RuntimeException t)
		{
			System.out.println(3);
		}
		catch(Exception t)
		{
			System.out.println(2);
		}
		catch(Throwable t)
		{
			System.out.println(1);
		}
		System.out.println("done");
	}
	
	// Order of the exception should be child to parents not parents to child
}

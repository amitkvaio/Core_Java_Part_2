package com.lara1;

public class Zmix
{
	public static void main(String[] args)
	{
		Zmix z = new Zmix();
		int j = z.test(10);
		System.out.println("j=" + j);
	}
	
	int test(int i)
	{
		try
		{
			int j = 10;
		} 
		catch (ArithmeticException e)
		{
			return 400;
		}
		finally
		{
			return 5000;
		}
		//return 2000;
	}
}


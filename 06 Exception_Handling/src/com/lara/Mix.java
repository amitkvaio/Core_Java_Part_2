package com.lara;

public class Mix
{
	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
			int i =10/0;
		} 
		catch (ArithmeticException ex)
		{
			ex.printStackTrace();
			System.out.println(ex);//ex.toString() is calling
			System.out.println(ex.toString());
			System.out.println(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
			
			
		}
	}
}

/*
getLocalizedMessage() is very similar to getMassage();
Internally JVM uses printStackTrace() method to print the exception information.
*/
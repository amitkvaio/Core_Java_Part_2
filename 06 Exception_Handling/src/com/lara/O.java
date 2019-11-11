package com.lara;

public class O
{
	public static void main(String[] args)
	{
		System.out.println(1);
		int i = 10 / 0;
		try
		{

			System.out.println(2);

		} catch (ArithmeticException ex)
		{

			System.out.println(3);
		}
		System.out.println(4);

	}
}

/*

before try if exception is occurs then catch block is not responsible 
to handled the exception that is try-catch block is not executed

*/
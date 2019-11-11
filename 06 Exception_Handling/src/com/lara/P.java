package com.lara;

public class P
{
	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
			System.out.println(2);
			int i = 10 / 0;
			System.out.println(3);

		} catch (ArithmeticException ex)
		{

			System.out.println(4);
			int j = 20 / 0;
			System.out.println(5);
		}
		System.out.println(6);

	}
}

/*
first exception arise in the try block which is handled through the catch block
but in the catch block another ArithmeticEception is arises and this exception
is not handled so flow will be terminating

*/
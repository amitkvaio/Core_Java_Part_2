package com.lara1;

public class I
{
	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
			test();
		} catch (ArithmeticException e)
		{
			System.out.println("exception");

		}
		System.out.println(2);
	}

	static void test()
	{
		System.out.println(3);
		int i = 10 / 0;
		System.out.println(4);
	}
}

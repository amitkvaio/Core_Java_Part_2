package com.lara;

public class C
{
	public static void main(String[] args)
	{
		System.out.println(1);
		test1();
		System.out.println(1);
	}

	static void test1()
	{
		System.out.println(3);
		test2();
		System.out.println(4);
	}

	static void test2()
	{
		System.out.println(5);
		String s1 = null;
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(6);
	}
}


/*
 through the null reference we can not reference any attribute any method.
 so it will produce NullPointerException
 
 
 */

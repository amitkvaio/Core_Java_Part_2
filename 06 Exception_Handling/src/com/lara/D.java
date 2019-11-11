package com.lara;

public class D
{
	static void test1()
	{
		System.out.println(1);
		test2();
		System.out.println(2);
	}

	static void test2()
	{
		System.out.println(3);
		// String s1="abc";
		int i = Integer.parseInt("abc");
		System.out.println(4);
	}

	public static void main(String[] args)
	{
		System.out.println(5);
		test1();
		System.out.println(6);
	}
}

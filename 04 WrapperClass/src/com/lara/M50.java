package com.lara;

public class M50
{
	static void test(Double d1)
	{
		System.out.println("Double");
	}

//	static void test(Number n1)
//	{
//		System.out.println("Number");
//	}

	static void test(Object obj)
	{
		System.out.println("Object");
	}

	static void test(byte... b)
	{

		System.out.println("var-args");
	}

	public static void main(String[] args)
	{
		short b1 = 10;
		test(b1);
	}
}

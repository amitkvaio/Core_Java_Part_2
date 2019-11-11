package com.lara;

public class M49
{
	/*static void test(Byte b)
	{
		System.out.println("Byte");
	}*/

	static void test(Double d1)
	{
		System.out.println("double");
	}

//	static void test(Number n1)
//	{
//		System.out.println("Number");
//	}

//	static void test(Object obj)
//	{
//		System.out.println("Object");
//	}

	static void test(Byte... b)
	{
		System.out.println("var-args");
	}

	public static void main(String[] args)
	{
		byte b1 = 10;
		test(b1);
	}
}

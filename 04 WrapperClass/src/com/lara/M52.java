package com.lara;

public class M52
{
	static void test(Double d1)
	{
		System.out.println("Double");
	}

	static void test(byte... b)
	{
		System.out.println("var-args");
	}

	public static void main(String[] args)
	{
		byte b1 = 10;
		test(b1);
	}
}

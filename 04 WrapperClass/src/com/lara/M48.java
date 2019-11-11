package com.lara;

public class M48
{
//0
//	static void test(byte i)
//	{
//		System.out.println("byte");
//	}
	
//1	
	
//	static void test(int i)
//	{
//		System.out.println("int");
//	}

//2
	
//	static void test(Byte b)
//	{
//		System.out.println("Byte");
//	}
	
	static void test(Double d1)
	{
		System.out.println("Double");
	}
//3
	
//	static void test(Number n1)
//	{
//		System.out.println("Number");
//	}
//4	
	
//	static void test(Object obj)
//	{
//		System.out.println("Object");
//	
//	}
	static void test(byte...b)
	{
		System.out.println("Var-args");
	}
	public static void main(String[] args)
	{
		byte b1=10;
		test(b1);
	}
}

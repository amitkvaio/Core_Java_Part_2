package com.lara1;

public class X1
{
	void test1()
	{
		System.out.println(1);  
		Y y1 = new Y();
		//y1.test2();
		System.out.println(2);
	}
}
//class Y1
//{
//	void test2()
//	{
//		System.out.println(3);
//		try
//		{
//			Z z1 = new Z();
//			z1.test3();
//		} 
//		catch (NumberFormatException e)
//		{
//			
//			System.out.println("ex");// TODO: handle exception
//			System.out.println(4);
//		}
//	}
//}
class Z1
{
	void test3()
	{
		System.out.println(5);
		int i = Integer.parseInt("abc");
		System.out.println(6);
	}
}
class J1
{
	public static void main(String[] args)
	{
		System.out.println(7);
		X x1 = new X();
		//x1.test1();
		System.out.println(8);
	}
}
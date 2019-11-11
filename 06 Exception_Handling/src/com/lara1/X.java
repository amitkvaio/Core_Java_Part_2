package com.lara1;

public class X
{
	public static void main(String[] args)
	{
		try
		{
			int i = 10/0;
		}
		catch(Throwable t)
		{
			System.out.println(t);
			System.out.println(1);
		}
//		catch(Exception t)
//		{
//			System.out.println(2);
//		}
//		
//		catch(RuntimeException t)
//		{
//			System.out.println(3);
//		}
//		catch(ArithmeticException t)
//		{
//			System.out.println(4);
//		}
		System.out.println("done");
	}
}

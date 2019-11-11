package com.lara;

public class X
{
	public static void main(String[] args)
	{
		System.out.println(1);
		int i = Integer.parseInt("abc");// NumberFormatException
		System.out.println(2);
		try
		{
			System.out.println(3);
		} catch (NullPointerException ex)
		{
			System.out.println(4);
		} finally
		{
			System.out.println(5);
		}
		System.out.println(6);
	}
}
/*
before try there is an exception so that control will not come inside the 
	try-catch block and also not come inside the finally block.
finally block will executed only when the control enter inside the try block.
if something is happen before the try then finally block will be not executing

*/
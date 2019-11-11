package com.lara;

public class W
{
public static void main(String[] args)
{
	if(true)
	{
		System.out.println("if");
		return;
	}
	try
	{
		System.out.println(1);
		return;//optional
	}
	catch(ArithmeticException ex)
	{
		System.out.println(2);
	}
	finally
	{
		System.out.println(3);
	}
	System.out.println(4);
}
}

/*
 
 after the if block what ever statement are there whole statement 
 are working as else block.
 if else block will false then only try-catch-finally will be executing.
 */

/*
 if(true)
 {
 System.out.println("if");
		return;
 }
 else
 {
 try
	{
		System.out.println(1);
		return;//optional
	}
	catch(ArithmeticException ex)
	{
		System.out.println(2);
	}
	finally
	{
		System.out.println(3);
	}
	System.out.println(4);
 }
 */

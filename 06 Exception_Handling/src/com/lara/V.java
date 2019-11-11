package com.lara;

public class V
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(1);
			return;// optional
		} catch (ArithmeticException ex)
		{
			System.out.println(2);

		} finally
		{
			System.out.println(3);
		}
		System.out.println(4);
		System.out.println("done");
		System.out.println("lara institute of technology");
	}
}
/*
inside try no exception so control will not enter inside the catch block.
finally block will be executed for every execution.
finally block should be the last statement of the program
if there is any statement after the finally block then 
it will not executed

*/
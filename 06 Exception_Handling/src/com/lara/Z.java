package com.lara;

public class Z
{
	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
			System.out.println(2);
			System.exit(0);
			System.out.println(3);
		} catch (ArithmeticException ex)
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
inside the System class there is a method exit(arg) which 
terminate the control flow of the execution of the program
arg is for priority purpose zero has more priority

Case 1:- whenever the control is entered into try block then only finally block will be 
	executed otherwise it is not executed.
Case 2:- In the program when we used System.exit(0) 
	the JVM will be shutdown hence the rest of the code won’t be executed
*/
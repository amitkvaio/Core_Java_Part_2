package com.lara1;

public class M
{
	public static void main(String[] args)
	{
		System.out.println(0);
		try
		{
			System.out.println("1");
			test();
		} catch (ArithmeticException|ClassNotFoundException ex)
		{
			System.out.println("2");
			System.out.println(ex);
			System.out.println("3");
		}  
		System.out.println(4);
	}

	static void test() throws ArithmeticException, ClassNotFoundException
	{
		System.out.println(5);
		//int j =3/0;
		Class.forName("");
		System.out.println(4);
	}
}

/*
throws-keyword is used for checked exception and unchecked Exception
guiding compiler that exception object will be handled by the callers.
compiler is looking for the caller
single throws can keep n number of exception class by keeping comma as delimiter

Throws keyword:-
There are two approaches two handle the exceptions in java
a. By using try-catch blocks.
b. By using throws keyword.

Handling exception by using Try-catch
1. Try-catch blocks are used to write the exception handling code.
2. By using try-catch blocks it is possible to handle multiple exceptions by using multiple catch blocks.
3. We can write the try-catch blocks at method implementation level.
4. We can provide the try-catch blocks at method & constructor & blocks level.

Handling Exception by using throws keyword
1.Throws keyword is used to delegate the responsibilities of exception handling to caller method.
2.By using throws it is possible to handle multiple exceptions because one method is able to throws multiple exceptions at time.
3.We can write the throws keyword at method declaration level.
4.We can provide the throws keyword only at method & constructor level but not block level.

*/
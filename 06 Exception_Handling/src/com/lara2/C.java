package com.lara2;

public class C
{
	public static void main(String[] args)
	{
		System.out.println(1);
		if(true)
		{
			throw new ArithmeticException();
		}
		System.out.println(2);
	}
}

/*
Throw keyword:-
All methods use the throw statement to throw an exception. 
	The throw statement requires a single argument a throwable object. 
		Throwable objects are instances of any subclass of the Throwable class.
It is possible to throw user defined exceptions or predefined exceptions by using throw keyword.

Here's an example of a throw statement
throw someThrowableObject;
Note: - throw keyword is used to handover user created exception object to JVM 
	whether it is predefined exception class or user defined exception class.
Example:- throw statement throw an predefined exception.
Step 1:- create the Exception object explicitly by the developer by using new keyword.
new ArithmeticException("ratan not eligible");
Step 2:- handover (throw) user created Exception object to jvm by using throw keyword.
throw new ArithmeticException("ratan not eligible");


*/
package com.lara;

public class A
{
	public static void main(String[] args)
	{
		System.out.println(1);
		int i = 10 / 0;
		System.out.println(2);
	}
}

/*

int i = 10/0; is the abnormal condition which 
 arise the java.lang.ArithmeticException
 it will show the total AE with message  but execution flow will be terminated due to  
 exception is not handled
 if the exception will be handled then the flow will not terminating it will continue.

introduction:-
Dictionary meaning of the exception is abnormal termination.
An exception is an event that occurs during execution of the program,
 	that disturb normal flow of the program instructions.
If the application contains exception then the program terminated abnormally 
	then the rest of the application is not executed.

To overcome above limitation in order to execute the rest of the application & to 
	get normal termination of the application must handle the exception.

*/


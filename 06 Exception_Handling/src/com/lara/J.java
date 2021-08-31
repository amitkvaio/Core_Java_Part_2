package com.lara;
public class J {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			int i = 10 / 0;
		} catch (ArithmeticException ex) {
			System.out.println(2);
			System.out.println(ex);
			System.out.println(ex.toString());
			System.out.println(3);
		}
		System.out.println(4);
	}
}

/*
ArithmeticEception is getting handled through the catch block.

In java we are having two approaches to handle the exceptions
1) By using try-catch block.
2) By using throws keyword.
Exception Handling:-
The main objective of exception handling is to get normal termination of 
	the application in order to execute rest of the application code.
Exception handling means just we are providing alternate code to continue the 
	execution of remaining code & to get normal termination of the application.

*/



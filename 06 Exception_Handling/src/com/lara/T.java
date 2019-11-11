package com.lara;

import java.util.Scanner;

public class T
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some thing");
		String s1 = sc.next();
		try
		{
			System.out.println(1);
			int i = Integer.parseInt(s1);// exception
			System.out.println(2);
			int k = i / (i - 9);
			System.out.println(3);

		} catch (NumberFormatException ex)
		{
			System.out.println(4);
			System.out.println(ex);
			System.out.println(5);

		} finally
		{
			System.out.println("finally");
		}
		System.out.println(6);
	}
}

/*
Finally block:-
1) Finally block code is always executed irrespective of try and catch.
	2) It is used to provide clean-up code
	a. Database connection closing. Connection.close();
	b. streams closing. Scanner.close();
	c. Object destruction . Test t = new Test(); t=null;
3) It is not possible to write finally alone.
a. try-catch-finally ---> valid
b. try-catch ---> valid
c. catch-finally ---> invalid
d. try-catch-catch-finally ---> valid
e. try-finally ---> valid
f. catch-catch-finally ---> invalid
g. Try ---> invalid
h. Catch ---> invalid
i. Finally ---> invalid
\
*/
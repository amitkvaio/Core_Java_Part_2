package com.lara;

import java.util.Scanner;

public class R
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some thing");
		String s1 = sc.next();
		try
		{
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int k = i / (i - 9);
			System.out.println("k=" + k);
			System.out.println(3);

		} catch (ArithmeticException e)
		{
			System.out.println(4);
			System.out.println(e);
			System.out.println(5);
		} catch (NumberFormatException ex)
		{
			System.out.println(4);
			System.out.println(ex);
			System.out.println(5);

		}

		System.out.println(6);
	}
}

/*
 * case:1 Enter some thing abc 1 4 java.lang.NumberFormatException: For input
 * string: "abc" 5 6
 * 
 * we are getting input through the Scanner class, what ever we are giving the
 * input that input is assign into the s1.inside the try block we are trying to
 * convert string type input in integer format so it is not possible so it will
 * produce NumberFormateException.and NFE is handled through the 2nd catch
 * because 2nd catch is compatible for this exception. whenever exception occurs
 * only compatible catch will be executed to handled the arise exception
 * 
 * case:2
 * 
 * Enter some thing 18 1 2 3 6
 * 
 * no exception arise so no catch will be exceuted.
 * 
 * case:3 Enter some thing 9 1 2 4 java.lang.ArithmeticException: / by zero 5 6
 * 
 * arithmetic exception arise and it will be handled by the first catch block
 * because first catch is compatible for this exception.
 */

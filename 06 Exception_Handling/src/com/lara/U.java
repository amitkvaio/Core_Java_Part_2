
package com.lara;

import java.util.Scanner;

public class U
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some thing");
		String s1 = sc.next();
		int i = test(s1);

		System.out.println("Main=" + i);
	}

	static int test(String s1)
	{
		int i = 0;
		try
		{

			i = Integer.parseInt(s1);
			return i;
		}

		catch (NumberFormatException ex)
		{
			System.out.println(ex);
			System.out.println("Catch:->"+i);
			return 100;
		} finally
		{
			System.out.println("Finally->"+i);
			return 1000;
		}

	}
}

/*
 * case:1 Enter some thing anc
 * 
 * java.lang.NumberFormatException: For input string: "anc" i=1000 suppose it
 * will return to 100 but there is finally{} is executed for every execution so
 * i value is getting replaced by 1000
 * 
 * case:2 Enter some thing 123 i=1000
 * 
 * 
 * it should return to 123 but there is finally{} is executed for every
 * execution so i value is getting replaced by 1000
 */
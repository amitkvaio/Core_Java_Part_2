//10
package com01.Arrays;

import java.util.Arrays;

public class K
{
	public static void main(String[] args)
	{
		int x[] = new int[2];
		x[0] = 10;
		x[1] = 50;
		System.out.println("1 Befor Modification" +Arrays.toString(x));
		test1(x);
		/*
			Pass by reference | modification will effect to the main() method
		*/
		System.out.println("2 After Modification" +Arrays.toString(x));
		test2(x[0]);
		// Pass by values |modification will not effect the main() method
		System.out.println("3 not effect the Modification" +Arrays.toString(x));
	}

	static void test1(int y[])// (int x[]) // x and y both are pointing to the same arrays.
	{
		System.out.println("Befor change=" +Arrays.toString(y));
		y[0] = 20;// x[o]=20;
		y[1] = 200;
		System.out.println("After change=" +Arrays.toString(y));
	}

	static void test2(int z)// z=x[0]=20;
	{
		System.out.println(z);
		z = 30;
	}

}

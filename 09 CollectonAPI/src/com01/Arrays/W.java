//22
package com01.Arrays;

import java.util.Arrays;

public class W
{
	public static void main(String[] args)
	{
		int[] x = { 10, 20, 30, 40, 4, 25 };
		int i = Arrays.binarySearch(x, 25);
		System.out.println(i);
	}
}

/*
without sort() the given array we can not use the binarySearch, if we use
then we will get  the junk values.

x is the reference of the array, and 25 is value if this value is available then it gives the
index of the array 
*/
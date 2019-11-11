package com01.Arrays;

public class L1
{
	public static void main(String[] args)
	{
		int[] x = new int[5];
		System.out.println("befor modification x array size is=" + x.length);
		// It creates an array using new dataType[arraySize];
		// It assigns the reference of the newly created array to the variable x.

		int[] y = new int[3];
		x = y;
		// x array is modifying with y array with the array size of y array ,x[3]
		System.out.println("after modification x array size is=" + x.length);
		System.out.println("printing default value of x array");
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);// printing default value of x array
		}
		System.out.println("xxxxxxxxxxxxxxx");
		y = x;
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(y[i]);// printing default value of y array
		}

		// x[5] is abandon
		System.out.println("Done");
	}
}

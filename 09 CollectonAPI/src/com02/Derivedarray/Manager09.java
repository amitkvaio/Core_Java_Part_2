//33 Multidimensional Arrays
package com02.Derivedarray;

public class Manager09 {
	public static void main(String[] args) {
		int x[][] = new int[3][3];// [size of out array-row][size of inner array-column]

		// Before initialization
		for (int i = 0; i < x.length; i++)// iterating outer arrays
		{
			for (int j = 0; j < x[i].length; j++)// iterating inner arrays
			{
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;

		x[1][0] = 40;
		x[1][1] = 50;
		x[1][2] = 60;

		x[2][0] = 70;
		x[2][1] = 80;
		x[2][2] = 97;

		// After initialization
		for (int i = 0; i < x.length; i++)// iterating outer arrays
		{
			for (int j = 0; j < x[i].length; j++)// iterating inner arrays
			{
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}
}
// Array of arrays

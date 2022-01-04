//34
package com02.Derivedarray;

public class Manager10 {

	public static void main(String[] args) {
		int[] x[] = new int[3][1];// [outer size is mandatory][inner size is optional]

		System.out.println("x length->" + x.length);
		x[0] = new int[2];
		x[1] = new int[4];
		x[2] = new int[3];

		System.out.println("Printing the index of the above arrays--");
		for (int i = 0; i < x.length; i++)// iterating outer arrays
		{
			for (int j = 0; j < x[i].length; j++)// iterating inner arrays
			{
				System.out.print("x[" + i + "] [" + j + "] ");
			}
			System.out.println();
		}

		// After initialization
		System.out.println("Initialization and printing the values--");
		int k = 1;
		for (int i = 0; i < x.length; i++)// iterating outer arrays
		{
			for (int j = 0; j < x[i].length; j++)// iterating inner arrays
			{
				x[i][j] = k;
				System.out.print(x[i][j] + " ");
				k++;
			}
			System.out.println();
		}

	}
// the default value of inner array is zero
}

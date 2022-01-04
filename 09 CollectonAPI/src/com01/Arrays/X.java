//23
package com01.Arrays;

import java.util.Arrays;

public class X {
	public static void main(String[] args) {
		int[] x = { 10, 20, 30, 40, 4, 25 };
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		int i = Arrays.binarySearch(x, 4);
		System.out.println(i);

		i = Arrays.binarySearch(x, 10);
		System.out.println(i);

		i = Arrays.binarySearch(x, 40);
		System.out.println(i);
		System.out.println("............");

		i = Arrays.binarySearch(x, 24);
		System.out.println(i);
		System.out.println("'''''''''''");

		i = Arrays.binarySearch(x, 45);
		System.out.println(i);
	}
}
//if the element is not present in the array then compiler gives junk value
//depending upon the value
//4 to 10=-2
//10 to 20 = -3
//20 to 25 = -4
//25 to 30 = -5
//30 to 40 = -6
//>40=-7

/*
 * x is the reference of the array, and 25 is value if this value is available
 * then it gives the index of the array
 */

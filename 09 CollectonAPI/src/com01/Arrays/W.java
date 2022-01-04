//22
package com01.Arrays;

import java.util.Arrays;

public class W {
	public static void main(String[] args) {
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

The java.util.Arrays.binarySearch(Object[] a, Object key) method searches 
the specified array for the specified object using the binary search algorithm.
The array be sorted into ascending order according to the natural ordering 
of its elements prior to making this call. 
If it is not sorted, the results are undefined.
*/
//6
package com01.Arrays;

public class F {
	public static void main(String[] args) {
		int x[] = new int[3];
		System.out.println(x.length);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);

		}
		System.out.println(".........");
		for (int i : x) {
			System.out.println(i);
		}

	}
}
/*
Iterating the every element of array by using general and enhanced for loop
Once we initialized the array it has been initialized with default values according to the type of array.
Here type of x array is integer so default value of integer is zero
*/
//3
package com01.Arrays;

public class C {
	public static void main(String[] args) {
		int[] x;// array declaration
		x = new int[3];// array definition
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}
}
/*
Printing the default value and again re-initializing the array with different values and printing it
*/
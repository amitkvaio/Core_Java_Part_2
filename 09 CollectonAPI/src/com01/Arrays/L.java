//11
package com01.Arrays;

public class L {
	public static void main(String[] args) {
		int[] x = new int[2];
		int[] y = new int[3];
		x = y;
		System.out.println("x length=" + x.length);
		y = x;
		System.out.println("y length=" + y.length);
		System.out.println("Done");
	}
}
/*
 * first array become abandon array.
 * 
 */
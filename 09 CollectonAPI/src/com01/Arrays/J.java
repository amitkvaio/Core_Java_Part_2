//9
package com01.Arrays;

public class J {
	public static void main(String[] args) {
		int x[] = new int[2];
		int y[] = x;// where x is pointing y is also pointing same array object
		int z[] = y;// similarly
		// x=y=z
		x[0] = 10;
		y[1] = 20;
		System.out.println("y=" + y.length);
		System.out.println("z=" + z.length);

		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(".........");

		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println("..........");

		System.out.println(z[0]);
		System.out.println(z[1]);
	}
}

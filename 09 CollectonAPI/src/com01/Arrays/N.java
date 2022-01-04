 //13
package com01.Arrays;

public class N {
	public static void main(String[] args) {
		int[] x = new int[2];
		x[0] = 10;
		Object y = x;
		// y[1]=20;
		// we can not assign y[1]=20;becoz y is the object type we have to down casted
		// into the integer array type
		// The type of the expression must be an array type but it resolved to Object
		// so we have to down casted into the integer array type
		int[] z = (int[]) y;
		z[1] = 30;
		System.out.println(z[1]);
		System.out.println(z.length);
		System.out.println("Done");
	}
}

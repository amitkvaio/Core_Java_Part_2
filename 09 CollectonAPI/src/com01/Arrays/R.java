//17
package com01.Arrays;

import java.util.Arrays;

public class R {
	public static void main(String[] args) {
		int i = 0;
		test1(i);
		test1(10);
		int[] x = new int[2];
		x[0] = 10;
		x[1] = 20;
		System.out.println(Arrays.toString(x));
		test2(x);
		System.out.println(Arrays.toString(x));
		test2(new int[] { 90, 30, 50 });// reducing the stmt
	}

	static void test1(int x) {
		System.out.println(x);
	}

	static void test2(int[] x) {
		x[0] = 100;
		System.out.println(x.length);
	}
}
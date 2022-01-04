package com01.Arrays;

public class Kmix {
	public static void main(String[] args) {
		int[] x = new int[10];
		x[0] = 100;
		x[5] = 50;
		System.out.println("x[5]=" + x[5]);
		test(x);
		System.out.println("x[0]=" + x[0]);
	}

	static void test(int y[]) {
		System.out.println("static y[0]=" + y[0]);
		System.out.println("static y[5]=" + y[5]);
		y[0] = 10;
	}
}

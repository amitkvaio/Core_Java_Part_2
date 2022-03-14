package com.lara;

public class M45 {
	static void test(int x, double d, boolean b, String... y) {
		System.out.println(x);
		System.out.println(y.length);
	}

	public static void main(String[] args) {
		test(10, 10.00, true);
		test(10, 10.2, false, "abc");
		test(10, 10.2, false, "abc", "1", "2", "3");
		// test(30,"xyz","hello");
		// test(40,"done","check","hello");
	}
}

package com.lara;

public class M43 {
	static void test(int... x) {
		System.out.print("length=" + x.length + "\n");
		for (int i : x) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		test();
		test(20, 40, 70);
		test(90, 20, 10, 60, 70);
	}
}

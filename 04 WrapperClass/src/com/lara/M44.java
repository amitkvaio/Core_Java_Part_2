package com.lara;

public class M44 {
	static void test(String... var) {
		for (String s1 : var) {
			System.out.println(s1);
		}
		System.out.println("...........");
	}

	public static void main(String[] args) {
		test("abc");
		test("hello", "test");
		test("hello", "test", "xyz");
		test("abc", "hello", "test", "xyz");
	}
}

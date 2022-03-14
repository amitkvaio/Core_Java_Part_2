package com.lara;

public class M35 {
	static void test(int i) {
		System.out.println("int i");
	}

	static void test(Integer obj) {
		System.out.println("integer");
	}

	public static void main(String[] args) {
		int i = 20;
		Integer obj = new Integer(20);
		test(i);
		test(obj);
	}
}

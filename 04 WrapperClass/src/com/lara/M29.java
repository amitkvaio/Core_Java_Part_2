package com.lara;

public class M29 {
	static void test(int i) {
		System.out.println("i->" + i);
	}

	public static void main(String[] args) {
		Integer obj = new Integer(90);
		test(obj);
		test(obj.intValue());
	}
}

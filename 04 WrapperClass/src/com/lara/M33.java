package com.lara;

public class M33 {
	static Integer test(int i) {
		// return i;
		return Integer.valueOf(i);
	}

	public static void main(String[] args) {
		byte b1 = 20;
		Integer obj = test(b1);
		System.out.println("obj->" + obj);
	}
}

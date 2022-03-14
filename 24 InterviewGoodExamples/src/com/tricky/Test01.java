package com.tricky;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(1.0 / 0.0);
		System.out.println("--------------");

		char[] chars = new char[] { '\u0097' };
		String str = new String(chars);
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));

		System.out.println("\n\n*********************************");
		long longWithL = 1000 * 60 * 60 * 24 * 365L;
		long longWithoutL = 1000 * 60 * 60 * 24 * 365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
	}
}

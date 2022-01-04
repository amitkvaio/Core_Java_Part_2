//21
package com01.Arrays;

import java.util.Arrays;

public class V {
	public static void main(String[] args) {
		String[] x = { "abc", "aBc", "ABc", "123", 
				"a12B", "ABC", "Abc", "9899", "9999", "done" };
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}
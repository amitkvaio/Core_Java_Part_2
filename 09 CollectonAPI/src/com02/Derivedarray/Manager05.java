//29
package com02.Derivedarray;

import java.util.Arrays;

public class Manager05 {
	public static void main(String[] args) {

		int[] x = { 10, 20, 40, 30 };

		Integer y[] = { new Integer(9), 19, 20, new Integer(15) };

		String z[] = { "abd", new String("abc"), "lara", "java" };
		D d[] = { new D(19), new D(11), new D(20), new D(17), new D(45) };

		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println("-------------------------------");
		System.out.println(Arrays.toString(y));
		Arrays.sort(y);
		System.out.println(Arrays.toString(y));
		System.out.println("-------------------------------");
		System.out.println(Arrays.toString(z));
		Arrays.sort(z);
		System.out.println(Arrays.toString(z));
		System.out.println("--------------------------------");
		System.out.println(Arrays.toString(d));
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		System.out.println("---------------------------");
	}
}
/*
in all the wrapper classes and String class its implements the comparable interface.
*/

package com01.Arrays;

import java.util.Arrays;
//Shows how to copy arrays using Arrays.copyOf.
public class Z {
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5 };
		int[] copy = Arrays.copyOf(original, original.length);
		System.out.println(Arrays.toString(copy));
	}
}

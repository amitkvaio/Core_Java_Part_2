package com01.Arrays;

import java.util.HashSet;

//Finding Common Elements in Two Arrays
public class ZA {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 3, 4, 5, 6 };
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> common = new HashSet<>();

		for (int num : array1) {
			set.add(num);
		}

		for (int num : array2) {
			if (set.contains(num)) {
				common.add(num);
			}
		}
		System.out.println("Common Elements: " + common);
	}
}

package com.tricky;

import java.util.Arrays;

//How do you check if the given 2 Strings below are Anagrams or Not?
public class Test03 {
	public static void main(String[] args) {
		char[] s1="home".toCharArray();
		char[] s2="mohe".toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		boolean result = new String(s1).equals(new String(s2));
		System.out.println(result);
	}
}

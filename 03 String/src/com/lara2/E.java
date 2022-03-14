package com.lara2;

public class E {
	public static void main(String[] args) {
		String s1 = "abc hello abc";
		          // 0123456789012
		int i = s1.lastIndexOf('a');// 10
		System.out.println(i);
		int j = s1.lastIndexOf("l");// 7
		System.out.println(j);
		int k = s1.lastIndexOf('c');// 12
		System.out.println(k);

	}
}
/*
 * lastIndexOf public int lastIndexOf(int ch) Returns the index within this
 * String of the last occurrence of the specified character.
 */
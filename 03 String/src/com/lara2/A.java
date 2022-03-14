package com.lara2;

public class A {
	public static void main(String[] args) {
		String s1 = "hello 123";
				  // 012345678
		int i = s1.indexOf('e');// 1
		System.out.println(i);
		int j = s1.indexOf('2');// 7
		System.out.println(j);
		int k = s1.indexOf('h');
		System.out.println(k);
		int l = s1.indexOf('3');
		System.out.println(l);
		int m = s1.indexOf('1');
		System.out.println(m);
		int n = s1.indexOf('8');
		System.out.println(n);
	}
}
//if the character is not present in the given string then compiler gives output as -1
/*
 * indexOf public int indexOf(int ch) Returns the index within this string of
 * the first occurrence of the specified character.
 */
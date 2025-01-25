package com.lara2;

public class D {
	public static void main(String[] args) {
		String s1 = "abc abc abc";
				  // 012345678901
		int i = s1.indexOf("abc");// 0
		System.out.println(i);
		int j = s1.indexOf("abc", 2);// 4
		System.out.println(j);
		int k = s1.indexOf("abc", 6);// 8
		System.out.println(k);
	}
}

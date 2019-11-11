package com.tricky01;

public class E {
	public static void main(String[] args) {
		String str1 ="abc";
		String str2=str1;
		String str3 = new String("abc");
		System.out.println(str1==str2);
		System.out.println(str3==str1);
		System.out.println(str1==str3.intern());
	}
}

package com.lara1;

public class Q {
	public static void main(String[] args) {
		String s1 = " abc xyz ";
		System.out.println(s1.length());
		String s2 = s1.trim();
		s1 = s1.trim();
		System.out.println(s2.length());
		System.out.println(s1.length());

	}
}

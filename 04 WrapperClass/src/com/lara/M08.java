package com.lara;

public class M08 {
	public static void main(String[] args) {
		String s1 = "true";
		String s2 = "gh";
		String s3 = "abc";

		Boolean b1 = Boolean.valueOf(s1);
		Boolean b2 = Boolean.valueOf(s2);
		Boolean b3 = Boolean.valueOf(s3);

		boolean b4 = b1.booleanValue();
		boolean b5 = b2.booleanValue();
		boolean b6 = b3.booleanValue();

		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
	}
}

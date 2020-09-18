package com.lara1;

public class D {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "amit";
		String s4 = " ";
		String s5 = null;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s4.equals(s5));
		System.out.println(s3.equals(s4));
	}
}
/*
 * Open Declaration boolean java.lang.String.equals(Object anObject) equals
 * public boolean equals(Object anObject) equals method got override it will be
 * checking contain of the two string object
 * 
 * /
 */
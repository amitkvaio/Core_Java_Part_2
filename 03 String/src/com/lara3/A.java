package com.lara3;

public class A {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "ja";
		String s3 = s2 + "va";
		System.out.println(s1 == s3);// F , checking both reference variable pointing to the same object of not.
		System.out.println(s1.equals(s3));// T, checking the content is equal or not .
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("done");
	}
}

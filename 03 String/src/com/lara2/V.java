package com.lara2;

public class V {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "amit";
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// false
	}
}

/*
 * The = = operator compares references not values, if the both the string have the same reference then it
 * will return true else false.
 * 
 */
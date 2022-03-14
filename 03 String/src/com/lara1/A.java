package com.lara1;

public class A {
	public static void main(String[] args) {
		String s1 = "amit";
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(new A().toString());
		// getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}

/*
 * in the String class toString() is got overloaded.
 * 
 */
package com.lara2;

public class Z {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "ja" + "va";

		System.out.println(s1 == s2);// T
		System.out.println(s1.equals(s2));// T

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

/*
 * 
 * + operator is not using new keyword to create the string object. string s2
 * object is creating in the constant pool
 */
package com.lara3;

public class C {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "ja";
		String s3 = s2.concat("va");
		System.out.println(s1 == s3);// f
	}
}

/*
 * 
 * where ever reference variable is there it is using new operator to create the
 * string object so object will created in the non constant pool.
 * 
 * 
 */
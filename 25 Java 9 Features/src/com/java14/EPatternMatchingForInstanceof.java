package com.java14;

//This is preview feature
public class EPatternMatchingForInstanceof {
	public static void main(String[] args) {
		//Before java 14
		Object obj = "Hello, Java";
		if (obj instanceof String) {
		    String s = (String) obj;
		    System.out.println(s.toUpperCase());
		}
	}
}
/*
Pattern Matching for instanceof (Preview)
Simplifies type casting and checking.
*/

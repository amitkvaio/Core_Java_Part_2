package com.java14;

public class EPatternMatchingForInstanceof2 {
	public static void main(String[] args) {
		Object obj = "Hello, Java";

		//Java 14+ Pattern Matching Way
		if (obj instanceof String str) {
		    System.out.println(str.toUpperCase());  // HELLO, JAVA
		}
	}
}

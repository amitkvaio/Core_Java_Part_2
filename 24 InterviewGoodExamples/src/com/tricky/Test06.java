package com.tricky;
//Java Program to check if a vowel is present in the string?
public class Test06 {
	public static void main(String[] args) {
		String str = "Hello";
		boolean status = str.toLowerCase().matches(".*[aeiou].*");
		System.out.println(status);
	}
}

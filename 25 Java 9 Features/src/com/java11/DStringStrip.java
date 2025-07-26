package com.java11;

public class DStringStrip {
	public static void main(String[] args) {
		String str = "  Hello Java  ";
		System.out.println(str.strip()); 		// "Hello Java"
		System.out.println(str.stripLeading()); // "Hello Java "
		System.out.println(str.stripTrailing());// " Hello Java"
	}
}
/*
strip() 		: It is used to remove the white spaces which are in-front and back of the string
stripTrailing()	: It is used to remove the white-space which is in the back of the string
stripLeading()	: It is used to remove the white space which is in front of the string

*/
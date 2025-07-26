package com.java12;

public class BStringIndentMethod {
	public static void main(String[] args) {
		String text = "Line1\nLine2";
		System.out.println(text.indent(4));
		
		String text1 = "    Hello\n    Java 12";
		System.out.println(text1.indent(-2));
		
		
		String text2 = "Line1\n\nLine2";
		System.out.println(text2.indent(2));
	}
}
/*
New String.indent() Method
Easily adds or removes indentation from multi-line strings.
Adds 4 spaces to the beginning of each line.


text1.indent(-2) : Removes 2 spaces from the beginning of each line.

text2.indent(2)	:  Keeps empty lines and adds indent to others.
*/

package com.java11;

import java.util.stream.Collectors;

public class BStringlines {
	public static void main(String[] args) {
		String str = "Hello\nWorld\njava11";
		str.lines().forEach(System.out::println);
		
		System.out.println(str.lines().collect(Collectors.toList()));
	}
}
/*
Splits the string into a Stream of lines.
which is a collection of all substrings split by lines.

Output:
Hello
World
*/
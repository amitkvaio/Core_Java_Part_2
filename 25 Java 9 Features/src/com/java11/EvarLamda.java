package com.java11;

import java.util.List;

public class EvarLamda {
	public static void main(String[] args) {
		List<String> names = List.of("A", "B");
		names.forEach((var name) -> System.out.println(name));
	}
}
/*
We can now use var in lambda expressions
*/

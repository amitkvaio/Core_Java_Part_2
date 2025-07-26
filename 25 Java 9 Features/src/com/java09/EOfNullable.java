package com.java09;

import java.util.stream.Stream;

public class EOfNullable {
	public static void main(String[] args) {
		String name = "Java";
		String nullName = null;

		// Case 1: Non-null value
		Stream.ofNullable(name).forEach(System.out::println); // Output: Java

		// Case 2: Null value
		Stream.ofNullable(nullName).forEach(System.out::println); // Output: nothing
	}
}

/*
Returns a stream of one element if the value is not null.
Returns an empty stream if the value is null.

Stream.ofNullable("Java") → stream with "Java".
Stream.ofNullable(null) → empty stream, so forEach prints nothing.
*/
package com.java10;

import java.util.Optional;

public class COptionalorElseThrow {
	public static void main(String[] args) {
		Optional<String> name = Optional.of("Java");

		System.out.println(name.orElseThrow()); // Outputs: Java

		Optional<String> empty = Optional.empty();
		//System.out.println(empty.orElseThrow()); // Throws NoSuchElementException
	}
}
/*
orElseThrow() without arguments throws NoSuchElementException if the value is absent.
Makes Optional usage cleaner.
*/
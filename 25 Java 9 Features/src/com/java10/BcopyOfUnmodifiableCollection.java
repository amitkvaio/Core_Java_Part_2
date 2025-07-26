package com.java10;

import java.util.List;

public class BcopyOfUnmodifiableCollection {
	public static void main(String[] args) {
        List<String> original = List.of("Java", "Python");
        List<String> copy = List.copyOf(original);

        System.out.println(copy);
        // copy.add("C++");  // This will throw UnsupportedOperationException
    }
}
/*
Java 10 added copyOf() methods to List, Set, and Map to create unmodifiable copies of existing collections.
copyOf() returns an unmodifiable list.
Useful for ensuring immutability and preventing changes to internal data.
*/
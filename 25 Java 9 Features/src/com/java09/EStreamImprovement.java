package com.java09;

import java.util.stream.Stream;

public class EStreamImprovement {
	public static void main(String[] args) {
        Stream.of("Java", "Python", "C++")
                .takeWhile(s -> s.startsWith("J"))
                .forEach(System.out::println);  // Output: Java
    }
}

/*
Java 9 introduced several new methods in the Stream API, making it more powerful.
takeWhile() → Takes elements while the condition is true.
dropWhile() → Drops elements while the condition is true.
ofNullable() → Creates a stream with a nullable value.
*/
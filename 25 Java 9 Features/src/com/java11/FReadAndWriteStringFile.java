package com.java11;

import java.nio.file.Files;
import java.nio.file.Path;

public class FReadAndWriteStringFile {
	public static void main(String[] args) throws Exception {
        Path path = Files.writeString(Files.createTempFile("demo", ".txt"), "Hello from Java 11!");
        String content = Files.readString(path);
        System.out.println(content);
    }
}
/*
Simplifies reading/writing text files.
Using this readString and writeString static methods from the Files class, 
	Java 11 aims to reduce a lot of boilerplate code which makes it much easier to read and write files.

*/
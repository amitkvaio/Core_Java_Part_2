package com.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CFileMismatch3 {
	public static void main(String[] args)throws IOException {
		Path f3 = Files.writeString(Files.createTempFile("f3", ".txt"), "Hello World");
		Path f4 = Files.writeString(Files.createTempFile("f4", ".txt"), "Hello");

		System.out.println(Files.mismatch(f3, f4));  // 5
	}
}

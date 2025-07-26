package com.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CFileMismatch {
	public static void main(String[] args) throws IOException {
		Path file1 = Files.writeString(Files.createTempFile("file1", ".txt"), "Hello");
		Path file2 = Files.writeString(Files.createTempFile("file2", ".txt"), "Hello");

		System.out.println(Files.mismatch(file1, file2));  // -1
	}
}
/*
Files.mismatch(Path, Path) Method
Compares two files and returns the position of the first mismatch, or -1 if they’re identical.
*/
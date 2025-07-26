package com.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CFileMismatch2 {
	public static void main(String[] args) throws IOException {
		Path f1 = Files.writeString(Files.createTempFile("f1", ".txt"), "HiYo");
		Path f2 = Files.writeString(Files.createTempFile("f2", ".txt"), "HiYa");
		System.out.println(Files.mismatch(f1, f2));  // 3
	}
}
/*
Mismatch at Position 3
*/
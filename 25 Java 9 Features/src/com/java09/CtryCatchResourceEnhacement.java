package com.java09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CtryCatchResourceEnhacement {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        
        try (reader) {  // No need to redeclare the resource
            System.out.println(reader.readLine());
        }
    }
}
/*
In Java 9, we can use try-with-resources with already declared resources, making the code cleaner.
its improves readability and reduces redundancy.
*/
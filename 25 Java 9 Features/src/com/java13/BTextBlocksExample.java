package com.java13;

//Text Blocks (Preview)
public class BTextBlocksExample {
	public static void main(String[] args) {
		// Using a text block to define a multi-line string
		String json = """
				{
				    "name": "Java",
				    "version": 13,
				    "features": ["Text Blocks", "Switch Expressions"]
				}
				""";

		System.out.println("JSON:\n" + json);
	}
}

/*
Text blocks are introduced as a preview feature in Java 13, providing a new way to define multi-line string 
	literals. This feature simplifies the creation of strings that span multiple lines, 
	making them more readable and less error-prone.

Key Points:
Multi-line Strings: Easily define strings that span multiple lines.
Improved Readability: No need for concatenation or excessive escape sequences.
Indentation Management: Handles common leading whitespace automatically.


https://www.javaguides.net/2024/08/java-13-features.html
*/
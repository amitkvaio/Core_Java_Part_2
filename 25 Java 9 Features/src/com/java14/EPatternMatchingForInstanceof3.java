package com.java14;

// Multiple Types with Pattern Matching
public class EPatternMatchingForInstanceof3 {
	public static void main(String[] args) {
		Object data = 42;

		if (data instanceof String s) {
		    System.out.println("String: " + s.toLowerCase());
		} else if (data instanceof Integer i) {
		    System.out.println("Integer doubled: " + (i * 2));  // Output: 84
		}
	}
}

/*
Summary Table
Feature								Description												Code?
✅ Switch Expressions (Standard)		Clean, expressive switch with yield/arrow syntax		✅ Yes
✅ Records (Preview)					Easy-to-write data classes								✅ Yes
✅ Better NullPointerException		Shows which variable was null							⚙️ JVM
✅ Pattern Matching for instanceof	Combine type check and cast								✅ Yes
🛠️ JFR Event Streaming				Monitor app performance in real-time					🧠 Advanced
*/







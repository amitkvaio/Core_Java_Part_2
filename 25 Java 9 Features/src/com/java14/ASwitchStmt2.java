package com.java14;

public class ASwitchStmt2 {
	public static void main(String[] args) {
		int score = 85;

		String grade = switch (score / 10) {
		    case 10, 9 -> "A";
		    case 8 -> {
		        System.out.println("Inside case 8 block");
		        yield "B";
		    }
		    default -> "C or below";
		};

		System.out.println("Grade: " + grade);  // Output: Grade: B
	}
}
/*
String result = switch (value) {
    case X -> "Simple Value";
    case Y -> {
        // Complex logic
        yield "Computed Value";
    }
    default -> "Other";
};

In switch expressions, each case must produce a single value.
If the case body contains multiple statements, we can't use the -> syntax — instead, \
	we use case with a block { ... } and return a value using the yield keyword.
*/

package com.java14;

public class BSwitchYield {
	public static void main(String[] args) {
		int marks = 76;

		String grade = switch (marks / 10) {
		case 10, 9 -> "A+";
		case 8 -> "A";
		case 7 -> {
			String remark = (marks >= 75) ? "Good" : "Fair";
			System.out.println("Evaluating 70s range: " + remark);
			yield "B (" + remark + ")";
		}
		default -> "C or below";
		};

		System.out.println("Final Grade: " + grade);

	}
}

/*
We need multi-line logic inside a switch case.
We want to compute and return a value based on conditions.
*/
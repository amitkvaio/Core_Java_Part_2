package com.java12;

public class ASwitchStmtNewWay2 {
	public static void main(String[] args) {
		int num = 2;
		String value = switch (num) {
		    case 1 -> "One";
		    case 2 -> "Two";
		    default -> "Other";
		};
		
		System.out.println(value);  // Output: Two
	}
}

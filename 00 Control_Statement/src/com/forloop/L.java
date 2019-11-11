package com.forloop;
// Compiler is unable to identify the unreachable statement.
public class L {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Amit");
		}
		System.out.println("****************");
	}
}

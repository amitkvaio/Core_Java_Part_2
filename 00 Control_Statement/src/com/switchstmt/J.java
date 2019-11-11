package com.switchstmt;
// internal conversion of integer to character
public class J {
	public static void main(String[] args) {
		char ch = 'd';
		switch (ch) {
		case 100:
			System.out.println("Case 100");
			break;
		case 'A':
			System.out.println("Case A");
			break;
		case 30:
			System.out.println("Case 30");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}
}

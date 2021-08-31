package com.switchstmt;
// internal conversion of char to integer Unicode values a-97 A-65
public class I {
	public static void main(String[] args) {
		int a = 65;
		switch (a) {
		case 66:
			System.out.println("Case 66");
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

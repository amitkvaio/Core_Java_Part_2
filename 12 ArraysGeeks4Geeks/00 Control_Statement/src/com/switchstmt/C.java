package com.switchstmt;
// inside the witch for the case labels it is possible to provide the expression  (10+20+70,10*7,10/2)
public class C {
	public static void main(String[] args) {
		int a = 100;
		switch (a) {
		case 10+20+70:
			System.out.println("Case 100");
			break;
		case 10/2:
			System.out.println("Case 5");
			break;
		case 10*7:
			System.out.println("Case 70");
			break;

		default:
			System.out.println("Default");
			break;
		}
	}
}

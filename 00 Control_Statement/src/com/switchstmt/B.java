package com.switchstmt;

public class B {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
		case 10:
			System.out.println("Case 10");
			break;
		/*case 10:
			System.out.println("Case 20");
			break;*/
		case 30:
			System.out.println("Case 30");
			break;

		default:
			System.out.println("Default");
			break;
		}
		
	}
}
/*
	Inside the switch the case labels much be unique; if we
	are declaring duplicate case labels then the java compiler
	will raise compilation error "duplicate case label".

*/


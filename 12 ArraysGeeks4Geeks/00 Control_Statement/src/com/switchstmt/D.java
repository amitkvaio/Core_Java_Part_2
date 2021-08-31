package com.switchstmt;

public class D {
	public static void main(String[] args) {
		int a = 10,b=20;
		switch (a) {
		/*case a:
			System.out.println("Case 10");
			break;
		case b:
			System.out.println("Case 20");
			break;*/
		default:
			System.out.println("Default");
			break;
		}
	}
}
/*
	inside the switch the case label must be constant values.
	if we are declaring variables as a case labels the compiler will show compilation error
	saying "case expressions must be constant expressions"
*/
package com.switchstmt;
/*
	INSIDE THE SWITCH STATEMENTS break IS OPTIONAL.
	IF WE ARE NOT PROVIDING break statements then from the matched case onwards up to break
	statements will be executed,
	if there is no break statements then end of the switch will be executed.
	This situation is called as fall through inside the switch case.
*/
public class K {
	public static void main(String[] args) {
		int a = 65;
		switch (a) {
		case 'A':
			System.out.println("Case A");
		case 30:
			System.out.println("Case 30");
		case 66:
			System.out.println("Case 66");
			break;
		case 70:
			System.out.println("Case 70");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}
}

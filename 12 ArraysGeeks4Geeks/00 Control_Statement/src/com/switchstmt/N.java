package com.switchstmt;

public class N {
	public static void main(String[] args) {
		byte a = 125;
		switch (a) {
		case 126:
			System.out.println("Case 126");
			break;
		case 127:
			System.out.println("Case 127");
			break;
		/*case 128:
			System.out.println("Case 128");
			break;*/
		default:
			System.out.println("Default");
			break;

		}
	}
}
/*
	inside the switch case labels much be within the range of provided argument data type
	otherwise compiler will raise compilation error  saying "Type mismatch: cannot convert from int to byte"

*/

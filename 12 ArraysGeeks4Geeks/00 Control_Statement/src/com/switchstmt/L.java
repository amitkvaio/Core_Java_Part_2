package com.switchstmt;
// INSIDE THE SWITCH THE CASE LABELS MUCH MATCH WITH THE PROVIDED AREGUMENTS DATA TYPE
// OTHER WISE COMPILER WILL RAISE COMPILATION ERROR
// SAYING  "";
public class L {
	public static void main(String[] args) {
		char ch = 'a';
		switch (ch) {
		/*case "aaa":
			System.out.println("Case A");*/
		case 65:
			System.out.println("Case 30");
			break;
		case 'a':
			System.out.println("Case a");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}
}

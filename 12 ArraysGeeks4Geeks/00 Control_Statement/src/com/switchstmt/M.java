package com.switchstmt;
// WE CAN DECLARE THE default statements at starting or middle or end of the switch
public class M {
	public static void main(String[] args) {
		int a = 651;
		switch (a) {
		case 'A':
			System.out.println("Case A");
			break;
		default:
			System.out.println("Default");
			break;
		case 30:
			System.out.println("Case 30");
			break;
		}
	}
}

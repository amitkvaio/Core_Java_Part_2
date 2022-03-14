package com.tricky;

public class Test10 {
	public static void main(String[] args) {
		byte a = 127;
		byte b = 127;
		b += a; // ok
		//b = a + b; // error : cannot convert from int to byte
	}
}

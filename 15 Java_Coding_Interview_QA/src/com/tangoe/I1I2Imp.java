package com.tangoe;

public class I1I2Imp implements I1,I2 {
	public static void main(String[] args) {
		I1I2Imp imp = new I1I2Imp();
		imp.method1();
		imp.method2();
		imp.method3();
		imp.method4();
		
		I2.method5();
	}
}

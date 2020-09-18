package com.lara4;
public class O {
	public static void main(String[] args) {
		E.find("a1b2c3d45e89&97%26", "\\d");
		System.out.println("..............");
		E.find("a1b2c3d45e89&97%26", "\\d+");
		// 012345678901234567
	}
}

package com.lara;
public class E {
	static void print() {
		System.out.println(1);
		int i = 10 / 0;
		System.out.println(2);
	}
	public static void main(String[] args) {
		print();
	}
}
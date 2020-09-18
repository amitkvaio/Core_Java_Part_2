package com.lara5;
public class A {
	public static void main(String[] args) {
		System.out.printf("HELLO %s", "INDIA ", "AMIT");
		System.out.println();
		System.out.printf("HELLO %s %s", "INDIA ", "AMIT");
	}
}

/*
It will add only only string word with Hello i.e INDIA because %s is being used only one time
to Add AMIT also need to keep two times %s. below
System.out.printf("HELLO %s %s", "INDIA ", "AMIT");

*/
package com.lara;

public class M04 {
	public static void main(String[] args) {
		boolean b1 = false;
		Boolean b2 = new Boolean(b1);
		System.out.println(b2);

		Boolean b3 = new Boolean(true);
		System.out.println(b3);

		boolean b4 = b2.booleanValue();
		boolean b5 = b3.booleanValue();
		System.out.println("b4=" + b4);
		System.out.println("b5=" + b5);

		System.out.println("done");
	}
}

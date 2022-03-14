package com.lara;

public class M26 {
	public static void main(String[] args) {
		int i = 10;
		Integer j = new Integer(10);
		int k = j.intValue();

		Integer m = j;
		// Integer m1 = j.toString();
		System.out.println("m=" + m);
		System.out.println("m=" + m.toString());
		System.out.println("done");
	}
}

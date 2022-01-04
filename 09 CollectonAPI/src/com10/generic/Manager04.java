//134
package com10.generic;

class E<A, B> {
	A i, j;// i and j is generic type
	B m, n;// m, n are generic type
	String p, q;
}

class Manager04 {
	public static void main(String[] args) {
		E<String, String> e1 = new E<String, String>();

		E<Double, Boolean> e2 = new E<Double, Boolean>();

		e1.i = "abc";
		e1.j = "abc";
		e1.m = "abc";
		e1.n = "abc";
		e1.p = "abc";
		e1.q = "abc";

		e2.i = 100.21;
		e2.j = 90.23;

		e2.m = true;
		e2.n = false;

		e2.p = "abc";
		e2.q = "abc";

		System.out.println("done04");
	}
}
/*
 * if we are using generic data type for non -static class member then while
 * creating the object we need to supply the data type
 */
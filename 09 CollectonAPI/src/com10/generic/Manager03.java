//133
package com10.generic;

class D<T> {
	String s1;
	T s2;
}

class Manager03 {
	public static void main(String[] args) {
		D<Integer> d1 = new D<Integer>();
		d1.s1 = "abc";
		d1.s2 = 100;

		D<Double> d2 = new D<Double>();
		d2.s1 = "xyz";
		d2.s2 = 200.23;
		d2.s2 = 10.236;

		D<Boolean> b3 = new D<Boolean>();
		b3.s2 = true;

		System.out.println("done03");
	}
}
/*
	s1 data type is fixed
	s2 is generic type, s2 is varying from one object to another object. - So it is the generic type
*/
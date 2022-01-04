//140
package com10.generic;

interface M<X> {
	void test1(X x1);
	X test2(X x1);
}

class N<X> implements M<X> {
	public void test1(X y1) {
	}

	public X test2(X y1) {
		return y1;
	}
}

public class Manager10 {
	public static void main(String[] args) {
		N<String> n1 = new N<String>();
		n1.test1("abc");
		String s1 = n1.test2("xyz");
		System.out.println("S1 : " + s1);

		N<Integer> n2 = new N<Integer>();
		n2.test1(10);
		int i = n2.test2(100);
		System.out.println("i : " + i);
		System.out.println("done");
	}
}
/*
-- Here M generic type we are using inside the test1() and test2() method
-- test1() method taking the input parameter as Generic type
-- test2() method return type is generic.
-- class N<X> implements M<X>
-- Whenever generic type we are using we have to supply the same data type wile implementing it-i.e Generic type.
-- N<String> n1 = new N<String>();
-- while creating the object we need to supply the data type -it is mandatory otherwise - CTE
*/
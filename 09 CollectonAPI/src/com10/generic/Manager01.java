//131
package com10.generic;

class B {
	String s1;
	Integer i;
}

class Manager01 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.s1 = "abc";
		b1.i = 20;

		B b2 = new B();
		b2.s1 = "xyz";
		b2.i = 40;
		System.out.println("done01");
	}
}
/*
-- data type for every object of class B is fixed - so s1 and i both are not using generic type.
*/

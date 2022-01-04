//139
package com10.generic;

interface J<A> {
	void test1(A a1);
	A test2(A a1, int i);// return type of test2() is generic type,int i is fixed.
}

class K implements J<String> {
	public void test1(String s1) {
		System.out.println("From K test1");
	}

	public String test2(String s1, int i) {
		System.out.println("From K test2");
		return s1;
	}
}

class L implements J<Integer> {
	public void test1(Integer i) {
		System.out.println("From L test1");
	}

	public Integer test2(Integer i, int j) {
		System.out.println("From L test2");
		return i;
	}
}

class KK<A> implements J<A> {
	public void test1(A s1) {
		System.out.println("From KK test1");
	}

	public A test2(A s1, int i) {
		System.out.println("From KK test2");
		return s1;
	}
}

class Manager09 {
	public static void main(String[] args) {
		K k = new K();
		k.test1("Generic1");
		k.test2("abc", 10);
		System.out.println("----------------");
		L l = new L();
		l.test1(20);
		l.test2(20, 30);

		System.out.println("-----------");
		KK<String> kk = new KK<String>();
		kk.test1("def");
		kk.test2("ghi", 40);
		System.out.println("done");
	}
}
/*
 * 
 * -- While implementing the generic interface - need to supply the data type --
 * OR we can pass the same generic type See the class A.
 * 
 */
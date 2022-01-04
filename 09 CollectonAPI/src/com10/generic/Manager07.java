//137
package com10.generic;

class H<X> {
	X i; // i is the generic type

	H() {
	}

	H(X i) {
		this.i = i;
	}

	void set(X i) {
		this.i = i;
	}

	X get() {
		return i;
	}
}

public class Manager07 {
	public static void main(String[] args) {
		H<String> h1 = new H<String>();
		h1.set("abc");
		String s1 = h1.get();// abc
		System.out.println(s1);

		H<Integer> h2 = new H<Integer>(100);
		int i = h2.get();
		System.out.println(i);
	}
}

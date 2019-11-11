package com.clone.deepCopy;

public class B implements Cloneable {
	int j;
	A a;

	public B(int j, A a) {
		this.j = j;
		this.a = a;
	}

	// Overriding clone method to implement deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("From B class Clone method--");
		B b = (B) super.clone();
		b.a = (A) a.clone();
		return b;
	}
}
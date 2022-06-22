package com.clone.deepCopy;

public class A implements Cloneable {
	int i;

	public A(int i) {
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("From A class Clone method--");
		return super.clone();
	}
}
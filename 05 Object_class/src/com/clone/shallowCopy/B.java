package com.clone.shallowCopy;

public class B implements Cloneable {
	int j;
	A a;

	public B(int j, A a) {
		this.j = j;
		this.a = a;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
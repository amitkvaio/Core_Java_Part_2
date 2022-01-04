package com06.set;

class A implements Comparable {
	int i;

	A(int i) {
		this.i = i;
	}

	public int compareTo(Object obj) {
		return i - ((A) obj).i;
	}

	public String toString() {
		return Integer.toString(i);
	}
}
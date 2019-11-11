package com.rst;

class Mx {
	int i;

	Mx(int i) {
		this.i = i;
	}

	public String toString() {
		return "i=" + i;
	}
}

public class Mx1 {
	public static void main(String[] args) {
		Mx obj1 = new Mx(10);
		Mx obj2 = new Mx(10);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.i == obj2.i);

	}
}
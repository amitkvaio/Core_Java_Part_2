//119
package com08.treemap;

import java.util.TreeMap;

class A {

	int i;

	public A(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return " " + i;
	}
}

public class Manager04 {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(new A(9), "abc");
		map.put(new A(90), "abc1");
		map.put(new A(5), "abc2");
		System.out.println(map);
	}
}
/*
Exception in thread "main" java.lang.ClassCastException: com09.treemap.A cannot be cast to java.lang.Comparable

TreeMap internal using the sorting mechanism to sort the elements for that class should be comparable type
since Here class A is not comparable type due to this JVM throwing above exception.
*/
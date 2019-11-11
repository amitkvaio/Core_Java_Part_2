//120
package com08.treemap;

import java.util.TreeMap;

class B implements Comparable {

	int i;

	public B(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return " " + i;
	}

	@Override
	public int compareTo(Object obj) {
		return this.i - ((B) obj).i;
	}
}

public class Manager05 {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(new B(9), "abc");
		map.put(new B(91), "abc1");
		map.put(new B(19), "abc2");
		map.put(new B(5), "abc3");
		System.out.println(map);
	}
}
/*
TreeMap internal using the sorting mechanism to sort the elements for that class should be comparable type
since Here class B is  comparable type due to this sorting has done successfully.
*/
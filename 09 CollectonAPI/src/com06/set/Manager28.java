//104
package com06.set;

import java.util.TreeSet;

class K implements Comparable {
	int x;

	public K(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "x=" + x;
	}

	@Override
	public int compareTo(Object obj) {
		return this.x - ((K) obj).x;
	}
}

public class Manager28 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new K(9));
		set.add(new K(1));
		set.add(new K(5));
		set.add(new K(4));
		set.add(new K(2));
		System.out.println("Set:" + set);
	}
}
/*
 * sorted output
 */
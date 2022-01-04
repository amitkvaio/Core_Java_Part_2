//98
package com06.set;

import java.util.HashSet;

class I {
	int x, y;

	I(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public int hashCode() {
		System.out.println("from hashCode->" + x);
		return Integer.toString(x).hashCode();
	}

	public boolean equals(Object obj) {
		System.out.println("from equal->" + x);
		return (obj instanceof I && this.x == ((I) obj).x);
	}
}

public class Manager22 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new I(1, 2));
		set.add(new I(1, 3));
		set.add(new I(1, 5));
		set.add(new I(2, 1));
		System.out.println(set.size());
		System.out.println(set);
	}
}
/*
Equality checking has happen based on x value.
*/
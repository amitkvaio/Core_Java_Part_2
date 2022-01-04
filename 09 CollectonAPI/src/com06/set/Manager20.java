//96
package com06.set;

import java.util.HashSet;

class F {
	int i, j;

	F(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public int hashCode() {
		// System.out.println("From the hashCode()");
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode() + s2.hashCode();
		return hash;
	}

	@Override
	public String toString() {
		return "(" + i + "," + j + ")";
	}

	@Override
	public boolean equals(Object obj) {
		// System.out.println("from the equal method");
		return (obj instanceof F && i == ((F) obj).i && j == ((F) obj).j);
	}
}

public class Manager20 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new F(1, 2));
		set.add(new F(1, 2));
		set.add(new F(2, 1));
		set.add(new F(2, 1));
		System.out.println(set);
	}
}
/*
-- comparing first hash number with the second hash number, if both are same or equal
--  than it is calling equal method if it is returning true then it will not add if it false
	than it will add the object to the HashSet.
--  if the objects are different on the hash number than no need to call the equal method
	it will add the respective object or elements successful.

*/
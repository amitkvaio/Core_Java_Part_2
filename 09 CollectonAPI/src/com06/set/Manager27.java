//103
package com06.set;

import java.util.TreeSet;

class J implements Comparable<Object> {
	int i;

	J(int i) {
		this.i = i;
	}

	@Override
	public int compareTo(Object obj) {
		return i - ((J) obj).i;
	}

	@Override
	public String toString() {
		return "i=" + i;
	}
}

public class Manager27 {
	public static void main(String[] args) {
		TreeSet<J> set = new TreeSet<J>();
		set.add(new J(9));
		set.add(new J(2));
		set.add(new J(6));
		set.add(new J(7));
		set.add(new J(8));
		set.add(new J(23));
		System.out.println(set);
	}
}
/*
-- this is not comparable type give classCast Exception
-- thats why we need comparable interface
*/
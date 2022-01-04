//122
package com08.treemap;

import java.util.Comparator;
import java.util.TreeMap;

class D implements Comparable {
	int i;

	D(int i) {
		this.i = i;

	}

	@Override
	public String toString() {
		return " " + i;
	}

	@Override
	public int hashCode() {
		return Integer.toString(i).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.i == ((D) obj).i;
	}

	@Override
	public int compareTo(Object obj) {
		return this.i - ((D) obj).i;
	}

}

public class Manager07 {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(new D(9), "abc1");
		map.put(new D(9), "abc2");
		map.put(new D(9), "abc3");
		map.put(new D(90), "abc4");
		map.put(new D(0), "abc5");
		map.put(new D(80), "abc6");
		System.out.println(map);
	}
}
//i values get sorted

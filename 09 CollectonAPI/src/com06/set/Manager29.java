//105
package com06.set;

import java.util.Comparator;
import java.util.TreeSet;

class L {
	int i, j;

	L(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return "(" + i + "," + j + ")";
	}

	static class A implements Comparator {
		public int compare(Object obj1, Object obj2) {
			return ((L) obj1).i - ((L) obj2).i;
		}
	}

	static class B implements Comparator {
		public int compare(Object obj1, Object obj2) {
			return ((L) obj1).j - ((L) obj2).j;
		}
	}
}

public class Manager29 {
	public static void main(String[] args) {
		TreeSet set1 = new TreeSet(new L.A());
		set1.add(new L(1, 0));
		set1.add(new L(3, 7));
		set1.add(new L(2, 6));
		set1.add(new L(8, 9));
		set1.add(new L(4, 3));
		set1.add(new L(7, 3));
		System.out.println(set1);
		System.out.println("==================");

		TreeSet set2 = new TreeSet(new L.B());
		set2.add(new L(2, 3));
		set2.add(new L(3, 5));
		set2.add(new L(8, 4));
		set2.add(new L(4, 6));
		set2.add(new L(8, 9));
		set2.add(new L(3, 6));
		System.out.println(set2);
	}
}

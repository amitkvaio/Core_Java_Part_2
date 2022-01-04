//121
package com08.treemap;

import java.util.Comparator;
import java.util.TreeMap;

class C {
	int i, j;

	C(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString()

	{
		return "(" + i + "," + j + ")";
	}

	static class D implements Comparator {
		public int compare(Object obj1, Object obj2) {
			return ((C) obj1).i - ((C) obj2).i;
		}
	}

	static class E implements Comparator {
		public int compare(Object obj1, Object obj2) {
			return ((C) obj1).j - ((C) obj2).j;
		}
	}
}

public class Manager06 {
	public static void main(String[] args) {
		TreeMap map1 = new TreeMap(new C.D());
		map1.put(new C(9, 1), 9);
		map1.put(new C(0, 10), 19);
		map1.put(new C(1, 8), 92);
		map1.put(new C(8, 0), 91);
		map1.put(new C(5, 4), 39);
		System.out.println(map1);

		TreeMap map2 = new TreeMap(new C.E());
		map2.put(new C(9, 1), 9);
		map2.put(new C(0, 10), 19);
		map2.put(new C(1, 8), 92);
		map2.put(new C(8, 0), 91);
		map2.put(new C(5, 4), 39);

		System.out.println(map2);

	}

}

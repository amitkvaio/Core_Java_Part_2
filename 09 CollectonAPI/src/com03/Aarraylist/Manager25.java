//61 - Sorting based on i values
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;

class E implements Comparable {
	int i, j;

	E(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return " " + i + "|" + j;
	}

	public int compareTo(Object obj) {
		return i - ((E) obj).i;
	}

}

public class Manager25 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new E(10, 2));
		list.add(new E(12, 5));
		list.add(new E(24, 6));
		list.add(new E(25, 8));
		list.add(new E(9, 24));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}

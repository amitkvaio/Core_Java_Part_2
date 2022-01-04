//60
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;

class D implements Comparable {
	int i;

	D(int i) {
		this.i = i;
	}

	public String toString() {
		return " " + i;
	}

	public int compareTo(Object obj) {
		D d1 = (D) obj;
		return i - d1.i;
	}
}

public class Manager24 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new D(23));
		list.add(new D(22));
		list.add(new D(24));
		list.add(new D(36));
		list.add(new D(9));
		list.add(new D(7));
		list.add(new D(5));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}








/*
--For natural sorting purpose our class should be implements the Comparable Interface
--Data type should be homogeneous not heterogeneous it will throws the ClassCastException.
--No elements should be null
[ 23,  22,  24,  36,  9,  7,  5]
[ 5,  7,  9,  22,  23,  24,  36]

*/
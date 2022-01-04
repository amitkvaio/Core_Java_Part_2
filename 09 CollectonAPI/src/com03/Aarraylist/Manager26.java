//62 Implementing the Comparator Interface
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class F {
	int i, j;

	F(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return i + "|" + j;
	}
}

class G implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		return ((F) obj1).i - ((F) obj2).i;
	}
}

class H implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		return ((F) obj1).j - ((F) obj2).j;
	}
}

public class Manager26 {
	public static void main(String[] args) {
		ArrayList<F> list = new ArrayList<F>();
		list.add(new F(2, 3));
		list.add(new F(3, 5));
		list.add(new F(9, 6));
		list.add(new F(31, 24));
		list.add(new F(25, 23));
		list.add(new F(19, 34));
		list.add(new F(90, 14));
		System.out.println(list);

		System.out.println("..........");
		Collections.sort(list, new G());
		System.out.println(list);

		System.out.println("............");
		Collections.sort(list, new H());
		System.out.println(list);
	}

}

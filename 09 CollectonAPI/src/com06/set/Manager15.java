//91
package com06.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Manager15 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(90);
		set.add(9);
		set.add(0);
		set.add(8);
		set.add(190);
		set.add(40);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		System.out.println(set);

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
	}
}
/*
	no indexing , no key is assigning in the element.
	printing the set we are getting the output in the random way.
*/
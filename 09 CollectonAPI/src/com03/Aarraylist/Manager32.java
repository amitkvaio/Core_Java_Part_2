//68 using iterator remove() method
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager32 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + ",");
			// the obj we print the same one delete in the next line
			it.remove();

		}
		System.out.println();
		System.out.println(list);

	}

}
/*
 * whatever element is iterating same element is removing from the list through
 * the remove() method
 */
//74
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager38 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(20);
		list.add(12);
		list.add(45);
		list.add(69);
		list.add(57);
		list.add(45);

		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		System.out.println();
		list.add(37);
		System.out.println(list);
	}
}

/*
 * after the listIeration we can add any element.
 */
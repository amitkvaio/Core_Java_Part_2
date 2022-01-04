//75
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager39 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		list.add(35);
		System.out.println(list);

		ListIterator it = list.listIterator();
		it.add(50);

		while (it.hasNext()) {
			System.out.println(it.next() + ",");
		}
		System.out.println("....................");
		while (it.hasPrevious()) {
			System.out.println(it.previous() + ",");

		}
		System.out.println("...................");

		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}

		System.out.println("----------");
		System.out.println(list);
	}
}
/*
--ListInterface add() method is available.
--So it can allow to add any object after creation of ListInterface object.
--here we are adding the 50 to the ListInterface object
 50 will be the first elements(from the left hand side) of the above ArrayList
*/
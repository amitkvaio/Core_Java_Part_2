//73
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager37 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(90);

		ListIterator it = list.listIterator();
		//list.add(50); // Concurrent Modification Exception
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		System.out.println();
		System.out.println("-----------");

	}
}
/*
--Once we get the Listiterator object then we can not suppose to add/remove any elements in the list
--if we do then we will get concurrentmodificationException.
--after the iteration operation we can add/remove the element in the list.

*/


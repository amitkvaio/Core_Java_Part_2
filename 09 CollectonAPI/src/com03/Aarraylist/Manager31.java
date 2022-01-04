//67
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager31 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		System.out.println(list);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + ",");
		}
		System.out.println(".........");

		while (it.hasNext()) {
			// this is not going to execute because iterator execute only one time
			System.out.println(it.next() + ",");
		}
	}
}
/*
-- we can iterate the elements only one time by using iterator object.
-- Every time hasnext() method is checking whether elements are present in the array list or not.
*/
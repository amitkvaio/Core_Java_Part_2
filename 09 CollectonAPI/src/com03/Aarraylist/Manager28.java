//64 in the reverse order binary search will happend in the natural order
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager28 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(20);
		list.add(23);
		list.add(65);
		list.add(8);
		list.add(2);
		list.add(5);
		list.add(29);
		list.add(69);
		System.out.println(list);
		Comparator ctr = Collections.reverseOrder();
		Collections.sort(list, ctr);
		System.out.println(list);
		System.out.println("...............................");

		int i = Collections.binarySearch(list, 23, ctr);
		System.out.println(i);
		i = Collections.binarySearch(list, 65, ctr);
		System.out.println("....................");
		System.out.println(i);

	}

}

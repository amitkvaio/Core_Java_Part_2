//44
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager08 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(20);
		list1.add(23);
		list1.add(25);
		list1.add(12);
		System.out.println(list1);

		ArrayList list2 = new ArrayList(list1); // it add all element of list1 into list2
		list2.add("adddd"); // first list1 element in then list2 element
		list2.add(8);
		list2.add(0);

		System.out.println(list2);
	}
}

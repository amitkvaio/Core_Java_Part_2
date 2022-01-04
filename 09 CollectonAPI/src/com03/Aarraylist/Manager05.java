//41
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager05 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(0);
		list.add("xyz");// adding the "xyz" element in the list.
		System.out.println(list);

		list.add(2, "check");
		System.out.println(list);

	}
}
/*
insertion particular world at particular location in the index of the list
above in the 2nd index "check " is inserted in the list

[90, 0, check, xyz]
*/
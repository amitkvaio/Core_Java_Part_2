//49
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager13 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(9);
		list1.add(45);
		list1.add(8);
		list1.add(10);

		ArrayList list2 = new ArrayList();
		list2.add(2);
		list2.add(23);
		list2.add(10);
		list2.add(67);
		list2.add(12);

		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);

		list1.retainAll(list2);// it only retain the element which is in list1
		System.out.println(list1);
		System.out.println(list2);

	}
}

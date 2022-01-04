//42
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager06 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(90);
		list.add(19);
		System.out.println(list.toString());
		System.out.println("..............");

		ArrayList list1 = new ArrayList();
		list1.add(100);
		list1.add(50);
		list1.add(list);
		// adding all value of list into the list1 at the end
		System.out.println(list);
		System.out.println(list1);
	}
}

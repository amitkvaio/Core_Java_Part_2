//39
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add(9.9);
		list.add(true);

		System.out.println(list.get(0));// reading the zeroth element of the list.
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		System.out.println(list);
		// print all the content of the list because to toString() is already overided
		// in Arraylist clss
		System.out.println("...................");
		System.out.println("size =" + list.size());
		System.out.println("...................");
		System.out.println("iterating all the element of the list");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

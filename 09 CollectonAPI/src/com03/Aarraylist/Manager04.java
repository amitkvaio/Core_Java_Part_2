//40
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager04 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9.0);
		list.add(190);
		list.add("abc");
		System.out.println(list);
		// printing elements through the toString method
		System.out.println("....................");

		// printing elements through the general for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}

		System.out.println(".....................");
		// printing elements through the enhance for loop
		for (Object obj : list) {
			System.out.print(obj + ",");
		}
		System.out.println();
		System.out.println("-------------------");

	}
}

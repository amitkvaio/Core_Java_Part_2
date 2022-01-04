//43
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager07 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(9);
		list1.add(90);
		list1.add(0);
		list1.add(19);
		list1.add(40);
		System.out.println(list1);

		ArrayList list2 = new ArrayList();
		list2.add(23);
		list2.add(50);
		list2.add(70);
		list2.add(89);
		list2.add("abc");
		System.out.println(list2);

		System.out.println("...............");
		list2.add(2, list1);
		// it add the element at 2nd position and move the index to next after the list1

		System.out.println(list2);

	}
}

/*
 * 
 * [9, 90, 0, 19, 40] [23, 50, 70, 89, abc] ............... [23, 50, [9, 90, 0,
 * 19, 40], 70, 89, abc]
 * 
 */

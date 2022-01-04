//51
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager15 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(80);
		list.add(60);
		list.add(20);
		list.add(30);

		System.out.println(list);
		list.set(2, "abc");
		// fist it delete the previous element which is in the position of 2nd index
		// after that
		// set the abc at the 2nd palace in the list
		System.out.println(list);
		System.out.println("..............");
		list.set(4, "amit");
		System.out.println(list);
	}
}

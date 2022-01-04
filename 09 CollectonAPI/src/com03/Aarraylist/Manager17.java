//53
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Manager17 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(20);
		list.add(73);
		list.add(93);
		// list.add("ass");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

/*
Collections.sort(list)= it is internally using compareTO() method of comparable interface.
--Collections is one of the utility class.
--Sorting is happening in ascending order.
--while shorting object should be the homogeneous type other wise it through the run time exception.
*/
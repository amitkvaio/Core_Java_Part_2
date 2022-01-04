//63 binarySearch(--,--)
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Manager27 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("yello");
		list.add("indigo");
		list.add("red");
		list.add("blue");
		Collections.sort(list);
		System.out.println(list);

		System.out.println(Collections.binarySearch(list, "blue"));
		System.out.println(Collections.binarySearch(list, "indigo"));
	}
}











/*
-- binarySearch method gives the index number of the given object values
-- before sorting we can not call the binarySearch method.
-- if we called then it will gives the invalid output.	
*/

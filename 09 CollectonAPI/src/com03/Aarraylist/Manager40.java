//76 - ListIterator set method
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager40 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(91);
		list.add(8);
		list.add(7);
		System.out.println(list);
		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			Object obj = it.next();
			// object 9 is replaced by object "amit"
			if (obj.equals(9)) {
				it.set("amit");
			}
			System.out.print(obj + "/");
		}
		System.out.println();
		System.out.println(list);
	}
}

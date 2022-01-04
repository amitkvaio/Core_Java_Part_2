//45
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager09 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(0);
		list1.add(3);
		list1.add(34);
		list1.add("plk");
		list1.add("op");
		list1.add(345);
		System.out.println(list1);
		Object obj = list1.remove(3);
		System.out.println("3rd index element of the list is=" + obj);
		System.out.println(list1);

		// Object obj1=list1.remove(10); 10the index is not available in the list so it
		// gives RTE IOOBException.
		// System.out.println(obj);

	}
}
/*
remove()= Overloaded. Removes the first occurrence of the specified value or 
the element at the specified index.
when we remove the data by passing numeric value that is by default treated as a index value.
*/
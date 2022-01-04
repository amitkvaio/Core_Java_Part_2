//38
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager02 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(true);
		int i = (Integer) list1.get(0);
		boolean bl = (Boolean) list1.get(1);
		System.out.println(list1);
		System.out.println(i);
		System.out.println(bl);
	}
}

/*


auto boxing into the integer type of the zeroth index
get(0) return the zeroth element of the list or reading the zeroth element of the list
auto boxing into the Boolean type of the first index.
toString() is already override in Arraylist class
get =Returns the element at the specified index.

From 1.5 version onwards add the primitive data into ArrayList that data 
is automatically converted into wrapper object format is called Autoboxing.

*/
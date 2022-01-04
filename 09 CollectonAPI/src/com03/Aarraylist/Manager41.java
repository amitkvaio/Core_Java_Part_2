//How to get synchronized version of ArrayList?
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager41 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // non- synchronized version of ArrayList
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(91);
		list.add(8);
		list.add(7);
		System.out.println(list);

		List listSyn = Collections.synchronizedList(list);// synchronized version of ArrayList
		System.out.println("ListSyn:" + listSyn);
	}
}
/*
Q. How to get synchronized version of ArrayList?
by default ArrayList methods are not synchronized but 
	it is possible to get synchronized version of ArrayList by using following method.
--To get synchronized version of List interface use following Collections class static method
	
	public static List synchronizedList(List l)
*/



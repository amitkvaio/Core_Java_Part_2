//48
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager12 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(2);
		list1.add(4);
		list1.add(9);
		list1.add(46);
		list1.add(89);
		list1.add(23);
		list1.add(4);
		list1.add(8);

		ArrayList list2 = new ArrayList();
		list2.add(2);
		list2.add(5);
		list2.add(34);
		list2.add(4);
		list2.add(34);

		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);

		list1.removeAll(list1);// remove all the element from the list1
		System.out.println("-----------------");
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("-----------------");
		list2.removeAll(list2);// remove all the element from the list2
		System.out.println("list2=" + list2);
	}
}
/*
removall() method remove from list1 whatever elements are in list2 available into list1 , those 
element will be removing from lsit1

*/
//80
package com04.vec_linkedlist;

import java.util.LinkedList;

public class Manager04 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(910);
		list.add(920);
		list.add(390);
		list.add("abc");
		list.add("10");
		list.add("java");
		System.out.println(list);

		list.addFirst("first");
		list.addLast("last");
		System.out.println("After adding ::" + list);

		Object o1 = list.removeFirst();
		System.out.println(o1);
		Object o2 = list.removeLast();
		System.out.println(o2);

		System.out.println("After removing first and last object ::" + list);

	}
}
/*
	void addFirst(E e)--It is used to insert the given element at the beginning of a list.
	void addLast(E e) --It is used to append the given element to the end of a list.
	E removeLast() --	It removes and returns the last element from a list.
	E removeFirst() --	It removes and returns the first element from a list.
*/
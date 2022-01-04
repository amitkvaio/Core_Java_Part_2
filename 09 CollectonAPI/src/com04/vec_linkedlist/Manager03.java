//79
package com04.vec_linkedlist;

import java.util.LinkedList;

public class Manager03 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(9);
		list.add(78);
		list.add(68);
		list.add(46);
		list.add(23);
		list.add(14);
		list.add(67);

		System.out.println(list);
		System.out.println(".............");
		Object obj = list.poll();
		System.out.println(obj);
		System.out.println(list);

		System.out.println("............");
		Object obj1 = list.poll();
		System.out.println(obj1);
		System.out.println(list);
		System.out.println("Using pollFirst and pollLast method");
		list.pollFirst();
		list.pollLast();
		System.out.println("Final List : " + list);
	}
}
/*
E poll() 		It retrieves and removes the first element of a list.
E pollFirst() 	It retrieves and removes the first element of a list, or returns null if a list is empty.
E pollLast() 	It retrieves and removes the last element of a list, or returns null if a list is empty.
*/
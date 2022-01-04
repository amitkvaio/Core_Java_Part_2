//81
package com04.vec_linkedlist;

import java.util.LinkedList;

public class Manager05 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(100);
		list.add(20);
		list.add(40);
		list.add(12);
		System.out.println(list);

		System.out.println("Using peek method");
		list.peek();
		list.peekFirst();
		list.peekLast();
		System.out.println("After peek activity :" + list);

		System.out.println("Using poll method");
		list.poll();
		list.pollFirst();
		list.pollLast();
		System.out.println("After poll activity :" + list);
	}
}
/*
E peek() 		It retrieves the first element of a list
E peekFirst() 	It retrieves the first element of a list or returns null if a list is empty.
E peekLast() 	It retrieves the last element of a list or returns null if a list is empty.

E poll() 		It retrieves and removes the first element of a list.
E pollFirst() 	It retrieves and removes the first element of a list, or returns null if a list is empty.
E pollLast() 	It retrieves and removes the last element of a list, or returns null if a list is empty.
*/
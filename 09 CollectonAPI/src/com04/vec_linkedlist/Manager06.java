//82 - FIFO - FIRST IN FIRST OUT
// Through the linkedList we can achieve the LIFO AND FIFO
package com04.vec_linkedlist;

import java.util.LinkedList;

class Queue {
	private LinkedList list = new LinkedList();

	public void add(Object obj) {
		list.add(obj);
	}

	public Object processElements() {
		return list.removeFirst();
	}

	public String toString() {
		return list.toString();
	}

}

public class Manager06 {
	public static void main(String[] args) {
		Queue q1 = new Queue();
		q1.add("abc");
		q1.add("avx");
		q1.add("hello");
		q1.add(123);
		q1.add("done");
		System.out.println(q1);// internally calling the toString() method of QUEQUE
		// System.out.println(q1.toString());

		Object o1 = q1.processElements();// reading the head element and removing it
		System.out.println(o1);
		System.out.println(q1);

		Object o2 = q1.processElements();
		System.out.println(o2);
		System.out.println(q1);

	}
}
/*
 * E removeFirst() It removes and returns the first element from a list.
 */
//83 - LIFO - LAST IN FIRST OUT
package com04.vec_linkedlist;

import java.util.LinkedList;

class Stack {
	private LinkedList list = new LinkedList();

	public void add(Object obj) {
		list.add(obj);
	}

	public Object processElement() {
		return list.removeLast();
	}

	public String toString() {
		return list.toString();
	}

}

public class Manager07 {
	public static void main(String[] args) {
		Stack s1 = new Stack();// LIFO
		s1.add(90);
		s1.add("acn");
		s1.add(900);
		s1.add("done");
		s1.add("xyz");

		System.out.println(s1);
		Object o1 = s1.processElement();
		System.out.println(o1);

		System.out.println(s1);
		Object o2 = s1.processElement();
		System.out.println(o2);
		System.out.println(s1);
	}
}
/*
E removeLast() 	It removes and returns the last element from a list.
*/
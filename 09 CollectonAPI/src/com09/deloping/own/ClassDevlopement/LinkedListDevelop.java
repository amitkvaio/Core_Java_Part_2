//126
package com09.deloping.own.ClassDevlopement;

class Element {
	Element next;
	Element prev;
	Object data;
}

public class LinkedListDevelop {
	private Element head, back;

	public void add(Object obj) {
		Element e = new Element();
		e.data = obj;
		if (head == null) {
			head = e;
		} else {
			back.next = e;
		}
		e.prev = back;
		back = e;
		System.out.println("From add end");
		// back.next=front;//for circular linkedList
	}

	public void iterate() {
		Element e = head;
		while (e != null) {
			System.out.println(e.data);
			e = e.next;
		}

	}
}

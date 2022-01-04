//87 
package com05.priorityQue;

import java.util.Iterator;
import java.util.PriorityQueue;

class A implements Comparable {
	int i;

	A(int i) {
		this.i = i;
	}

	public int compareTo(Object obj) {
		return i - ((A) obj).i;
	}

	public String toString() {
		return Integer.toString(i);
	}
}

public class Manager11 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(new A(90));
		pq.add(new A(9));
		pq.add(new A(1));
		pq.add(new A(12));
		pq.add(new A(19));
		pq.add(new A(8));

		System.out.println(pq);

		Iterator it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(pq.poll());
			System.out.println(pq);
		}

	}
}

/*
 * inside the pq object we are storing A type of element and A is the comparable
 * type. storing is based on i value
 * 
 */
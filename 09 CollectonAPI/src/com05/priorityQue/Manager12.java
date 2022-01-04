//88
package com05.priorityQue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class B {
	int i, j;

	B(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return "(" + i + "," + j + ")";
	}
}

class C implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		return ((B) obj1).i - ((B) obj2).i;
	}

}

class D implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		return ((B) obj1).j - ((B) obj2).j;
	}

}

public class Manager12 {
	public static void main(String[] args) {
		PriorityQueue<B> pq = new PriorityQueue<B>(10, new C());// Sorting based on i values
		pq.add(new B(1, 2));
		pq.add(new B(10, 0));
		pq.add(new B(11, 3));
		pq.add(new B(14, 2));
		pq.add(new B(5, 34));
		System.out.println(pq);

		Iterator it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(pq.poll());
			System.out.println(pq);
		}
		System.out.println("----------------");

		PriorityQueue<B> pq1 = new PriorityQueue<B>(10, new D());
		pq1.add(new B(9, 1));
		pq1.add(new B(12, 3));
		pq1.add(new B(34, 24));
		pq1.add(new B(3, 7));
		pq1.add(new B(5, 8));
		pq1.add(new B(78, 34));
		System.out.println(pq1);

		Iterator it1 = pq1.iterator();
		while (it1.hasNext()) {
			System.out.println(pq1.poll());
			System.out.println(pq1);
		}
	}

}

//85 multiple data type is not allowed in PriorityQueue
package com05.priorityQue;

import java.util.PriorityQueue;

public class Manager09 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add("abc");
		pq.add("xyz");
		pq.add(10); // not allow multiple type of elements
		pq.add("asc");
		System.out.println(pq);
	}
}
/*
PriorityQuequ does not allow the multiple data type of element
because PriorityQuequ automatically sorting  the element in natural order
so one data type of element is needed for sorting purpose 
other wise compiler will give the class cast exception

*/
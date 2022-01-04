//84 PriorityQueue
package com05.priorityQue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Manager08 {
	public static void main(String[] args) {
		PriorityQueue q1 = new PriorityQueue();
		q1.add(9);
		q1.add(91);
		q1.add(19);
		q1.add(92);
		q1.add(29);
		q1.add(93);
		q1.add(39);
		q1.add(3);
		System.out.println(q1);

		Iterator it = q1.iterator();

		while (it.hasNext()) {
			System.out.println(q1.poll());
			System.out.println(q1);
		}
	}
}
/*
 -- PriorityQueue belongs to the Java Collections Framework. 
 -- PriorityQueue is based on  priority heap and it is an implementation of Queue interface. 
 -- This data structure can be used when we need a Queue implementation and 
 	we have a requirement to maintain the elements of that collection in a specific 
 	sorted order based on each element’s priority. 
--	It was introduced in JDK 1.5

Methods in PriorityQueue class:

boolean add(E element): This method inserts the specified element into this priority queue.

public remove(): This method removes a single instance of the specified element from this queue, 
	if it is present
public poll(): This method retrieves and removes the head of this queue, 
	or returns null if this queue is empty.
public peek(): This method retrieves, but does not remove, the head of this queue, 
	or returns null if this queue is empty.
Iterator iterator(): Returns an iterator over the elements in this queue.

boolean contains(Object o): This method returns true if this queue contains the specified element

void clear(): This method is used to remove all of the contents of the priority queue.

boolean offer(E e): This method is used to insert a specific element into the priority queue.

int size(): The method is used to return the number of elements present in the set.

toArray(): This method is used to return an array containing all of the elements in this queue.

Comparator comparator(): The method is used to return the comparator that can be used to 
	order the elements of the queue.

*/
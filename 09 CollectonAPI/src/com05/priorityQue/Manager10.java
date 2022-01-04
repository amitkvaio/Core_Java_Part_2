//86
package com05.priorityQue;

import java.util.PriorityQueue;

public class Manager10 {
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.add(10);
		q.add(null);// nullpoiter exception
		q.add(4);
		System.out.println(q);
	}
}

/*
every element of PriorityQueue is calling campareTo().
null value in the priorityQueue is not allowed if try to add 
It will throws run time exception saying NullPointerExcpetion
*/
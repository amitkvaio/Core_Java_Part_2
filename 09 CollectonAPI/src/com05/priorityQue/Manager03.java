package com05.priorityQue;

import java.util.PriorityQueue;

public class Manager03 {
	public static void main(String[] args) {

		// Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		System.out.println("PriorityQueue: " + numbers);

		// Using the remove() method
		boolean result = numbers.remove(2);
		System.out.println("Is the element 2 removed? " + result);

		// Using the poll() method
		int number = numbers.poll();
		System.out.println("Removed Element Using poll(): " + number);
	}
}

/*

remove() - removes the specified element from the queue
poll() - returns and removes the head of the queue

*/


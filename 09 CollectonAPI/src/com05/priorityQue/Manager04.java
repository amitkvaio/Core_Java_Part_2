package com05.priorityQue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Manager04 {
	public static void main(String[] args) {

		// Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		System.out.println("PriorityQueue using iterator():"+numbers);

		// Using the iterator() method
		Iterator<Integer> iterate = numbers.iterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}
}

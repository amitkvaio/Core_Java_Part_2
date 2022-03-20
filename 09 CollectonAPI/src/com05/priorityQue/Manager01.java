package com05.priorityQue;

import java.util.PriorityQueue;

public class Manager01 {
//Please go through the image PrirityQueue01.jpg.
	public static void main(String[] args) {
		// Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		
		numbers.add(4);
		numbers.add(2);
		System.out.println("PriorityQueue: " + numbers);

		numbers.offer(1);
		System.out.println("Updated PriorityQueue: " + numbers);
	}
}
/*

Insert Elements to PriorityQueue

add() - Inserts the specified element to the queue. If the queue is full, it throws an exception.
offer() - Inserts the specified element to the queue. If the queue is full, it returns false.

We have inserted 4 and 2 to the queue.

Although 4 is inserted before 2, the head of the queue is 2. 
It is because the head of the priority queue is the smallest element of the queue.

We have then inserted 1 to the queue. 
The queue is now rearranged to store the smallest element 1 to the head of the queue.
*/

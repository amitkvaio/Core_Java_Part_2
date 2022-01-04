package com06.set;

//basic operations on TreeSet.
import java.util.TreeSet;

public class Practice06 {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(50);
		t.add(20);
		t.add(40);
		t.add(10);
		t.add(30);
		System.out.println(t);// 10 20 30 40 50
		System.out.println(t.headSet(30));// [10,20]
		System.out.println(t.tailSet(30));// [30,40,50]
		System.out.println(t.subSet(20, 50));// [20,30,40]
		System.out.println("last element=" + t.last());// 50
		System.out.println("first element=" + t.first());// 10
		System.out.println("lower element=" + t.lower(50));// 40
		System.out.println("higher element=" + t.higher(20));// 30
		System.out.println("print & remove first element=" + t.pollFirst());// 10
		System.out.println("print & remove last element=" + t.pollLast());// 50
		System.out.println("final elements=" + t);// 20 30 40
		System.out.println("TreeSet size=" + t.size());// 3
		System.out.println(t.remove(30));
		System.out.println("TreeSet size=" + t.size());// 2
		System.out.println("final elements=" + t);// 20 40
	}
}

/*
Example :-basic operations on TreeSet.
public E first(); it print first element
public E last(); it print last element
public E lower(E); it print lower object of specified object
public E higher(E); it print higher object of specified object
public java/util/SortedSet<E> subSet(E, E); it print subset
public java/util/SortedSet<E> headSet(E); it print specified object above objects
public java/util/SortedSet<E> tailSet(E); it print specified objects below values
public E pollFirst(); it print and remove first
public E pollLast(); it print and remove last.
*/
//77 - Vector
package com04.vec_linkedlist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Manager01 {
	public static void main(String[] args) {
		Vector vt = new Vector();
		vt.add(90);
		vt.add(910);
		vt.add(190);
		vt.add(920);
		vt.add(390);
		System.out.println(vt);

		Iterator it = vt.iterator();

		while (it.hasNext()) {
			it.remove();
			System.out.println(it.next());
		}

		/*Enumeration enum1 = vt.elements();
		System.out.println("Iterating through the Enumeration");
		while (enum1.hasMoreElements())
		{
			System.out.println(enum1.nextElement());
		}
		System.out.println("Iterating through the ListIterator");

		ListIterator it = vt.listIterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}*/
	}
}
/*
Vector:- (legacy class introduced in 1.0 version)
	
	public class java.util.Vector extends java.util.AbstractList
	implements java.util.List<E>,
	java.util.RandomAccess,
	java.lang.Cloneable,
	java.io.Serializable
	
	1) Introduced in 1.0 version it is a legacy class.
	2) Heterogeneous objects are allowed.
	3) Duplicate objects are allowed.
	4) Null insertion is possible.
	5) Insertion order is preserved.
	6) The under laying data structure is grow able array.
	7) Vector all the methods are synchronized by default.
	8) Applicable cursors are Iterator,Enumeration,ListIterator.

Vector constructors:-
Vector();
Vector(int initialCapacity);
Vector(int intialCapacity, int increment);
Vector(java/util/Collection<? extends E>);

--if we have a requirement of sharing one container to multiple thread we can use
	vector class consists of same array list methods.

boolean add(E e) 	
		It is used to append the specified element to the end of a list.
*/

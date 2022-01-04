//66 Iterator and ListIterator interface - we can not create the object using the new operator
//- Printing the content of the arrays
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Manager30 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(5);
		list.add(4);
		list.add(0);
		list.add(2);
		System.out.println(list);
		System.out.println("---------");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}

		System.out.println();
		System.out.println("------");
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			System.out.print(lit.next() + ",");
		}
	}
}


/*

javap java.util.Iterator
Compiled from "Iterator.java"
public interface java.util.Iterator<E> {
  public abstract boolean hasNext();
  public abstract E next();
  public abstract void remove();
}

inside the Iterator and ListIterator object, hasNext() and next() both are used for reading the element 
one by one
if the element is in the list then it return true other wise it return false.

ITERATOR
--------
1) used to retrieve the objects from collection classes.
2) Introduced in 1.2 version it is not a legacy
3) It is used to retrieve the data from all collection classes.
4) It is a universal cursor because it is applicable for all collection classes.
5) Get the iterator Object by using iterator() method.
	Vector v =new Vector();
	v.add(10);
	v.add(20);
	Enumeration e = v.iterator();
6) It contains two methods
	hasNext(): to check the objects available or not.
	Next() : to retrieve the objects.
7) read & remove operations are possible.
8) Only forward direction.
9) Interface
10) It supports both normal and generic version.

ListIterator
-----------
1) Used to retrieve the data from collection classes.
2) Introduced in 1.2 version it is not a legacy
3) It is used to retrieve the data from only List type of classes like ArrayList,LinkedList,Vector,Stack.
4) Not a universal cursor because it is applicable for only List interface classes.
5) Get the ListIterator Object by using listIterator() method.
	Vector v =new Vector();
	v.add(10);
	v.add(20);
	Enumeration e = v.listIterator();
6) It contains 9 methods
7) Read, remove, add, and replace operations.
8) Bidirectional cursor direction.
9) Interface
10) It supports both normal and generic version.

ListIterator methods:-
----------------------
	public abstract boolean hasNext();
	public abstract E next();
	public abstract boolean hasPrevious();
	public abstract E previous();
	public abstract int nextIndex();
	public abstract int previousIndex();
	public abstract void remove();
	public abstract void set(E); //replacement
	public abstract void add(E);

Retrieving objects of collections classes:-
We are able to retrieve the objects from collection classes in 3-ways
1) By using for-each loop.
2) By using get() meth

*/
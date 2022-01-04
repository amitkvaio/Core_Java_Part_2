//78
package com04.vec_linkedlist;

import java.util.LinkedList;

public class Manager02 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("abc");
		l1.add(90);
		l1.add(80);
		System.out.println(l1.get(0));
		System.out.println(l1.get(1));
		System.out.println(l1.get(0));
	}
}
/*
java.util.LinkedList:-
	public class java.util.LinkedList extends java.util.AbstractSequentialList
	implements java.util.List<E>,
	java.util.Deque<E>,
	java.lang.Cloneable, java.io.Serializable

1) Introduced in 1.2 version.
2) Heterogeneous objects are allowed.
3) Null insertion is possible.
4) Insertion order is preserved.
5) LinkedList methods are non-synchronized.
6) Duplicate objects are allowed.
7) The under laying data structure is double linkedlist.
8) cursors :- Iterator,ListIterator

constructors:-
LinkedList(); it builds a empty LinkedList.
LinkedList(java/util/Collection<? extends E>);
it builds a LinkedList that initialized with the collection data.

-- Whatever methods available in ArrayList are available in LinkedList.
-- Internally it gives more perfomance.
 void linkLast(E);
 void linkBefore(E, java.util.LinkedList$Node<E>);
 E unlink(java.util.LinkedList$Node<E>);
 public E getFirst();
 public E getLast();
 public E removeFirst();
 public E removeLast();
 public void addFirst(E);
 public void addLast(E);
 public boolean contains(java.lang.Object);
 public int size();
 public boolean add(E);
 public boolean remove(java.lang.Object);
 public boolean addAll(java.util.Collection<? extends E>);
 public boolean addAll(int, java.util.Collection<? extends E>);
 public void clear();
 public E get(int);
 public E set(int, E);
 public void add(int, E);
 public E remove(int);
 java.util.LinkedList$Node<E> node(int);
 public int indexOf(java.lang.Object);
 public int lastIndexOf(java.lang.Object);
 public E peek();
 public E element();
 public E poll();
 public E remove();
 public boolean offer(E);
 public boolean offerFirst(E);
 public boolean offerLast(E);
 public E peekFirst();
 public E peekLast();
 public E pollFirst();
 public E pollLast();
 public void push(E);
 public E pop();
 public boolean removeFirstOccurrence(java.lang.Object);
 public boolean removeLastOccurrence(java.lang.Object);
 public java.util.ListIterator<E> listIterator(int);
 public java.util.Iterator<E> descendingIterator();
 public java.lang.Object clone();
 public java.lang.Object[] toArray();
 public <T> T[] toArray(T[]);
 public java.util.Spliterator<E> spliterator();
*/

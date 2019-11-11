//100 Using TreeSet
package com06.set;

import java.util.HashSet;
import java.util.TreeSet;

public class Manager24 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(90);
		set.add(9);
		set.add(0);
		set.add(19);
		set.add(6);
		set.add(18);
		set.add(190);
		System.out.println(set);
		TreeSet set1 = new TreeSet(set);
		System.out.println(set1);
	}
}
/*
1. TreeSet introduced in 1.2 version.
2. Heterogeneous data is not allowed.
3. Insertion order is not preserved but it sorts the elements in some sorting order.
4. Duplicate objects are not allowed.
5. Null insertion is possible only once.
6. TreeSet Methods are non-synchronized.
7. The underlying data Structure is Balanced Tree.
8. It supports Iterator cursor to retrieve the data.

Java.util.TreeSet:-
	public class java.util.TreeSet extends java.util.AbstractSet<E>
	implements java.util.NavigableSet<E>,
	java.lang.Cloneable,
	java.io.Serializable
<E> specifies the type of the Object the set will be hold.

Constructors:-
-------------
TreeSet();
It will create empty TreeSet that will be sorted in ascending order 
	according to natural order of its elements.

TreeSet(java/util/Collection<? extends E>);
	It creates the TreeSet with some collection data.
TreeSet(java/util/Comparator<? super E>);
	It will create empty TreeSet with comparator specified sorting order (customization or sorting).
TreeSet(java/util/SortedSet<E>);
	It builds the TreeSet that contains the elements of SortedSet.

*/

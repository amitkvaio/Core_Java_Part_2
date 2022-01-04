//37
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(new Integer(14));// in arraylist compiler is taking every element in this way new Integer(14)
		list.add(9.9);
		list.add("abc");
		list.add(true);
		list.add("amit");

		System.out.println(list);// all the element up casted to Object type
	}
}

/*
HDNPI
Arrays do not automatically change
their size at execution time to accommodate additional elements. The collection class
ArrayList<T> (from package java.util) provides a convenient solution to this problem—
it can dynamically change its size to accommodate more elements. 

Implementation classes of List interface :-
1) ArrayList
2) LinkedList
3) Vector
4) Stack

List interface common properties:-
1) All list class allows heterogeneous data.
2) All List interface implementation classes allows null insertion.
3) All classes allows duplicate objects.
4) All classes preserved insertion order.


ArrayList Characteristics:-
1) ArrayList Introduced in 1.2 version.
2) ArrayList stores Heterogeneous objects(different types).
3) In ArrayList it is possible to insert Null objects.
4) Duplicate objects are allowed.
5) ArrayList preserved Insertion order it means whatever the order we inserted the data in the same way output will be printed.
6) ArrayList methods are non-synchronized methods.
7) The under laying data structure is grow able array.
8) By using cursor we are able to retrieve the data from ArrayList : Iterator , ListIterator
9) it is mainly for storing the elements into order wise by providing the sequential index

Constructors to create ArrayList:-
Constructor-1:-
	ArrayList al = new ArrayList();
	The default capacity of the ArrayList is 10 once it reaches its maximum capacity then 
	size is automatically increased by New capacity = (old capacity*3)/2+1
Constructor-2:-
	ArrayList al = new ArrayList ( int initial-capacity);
It is possible to create ArrayList with initial capacity
Constructor-3:-
	ArrayList al = new ArrayList(Collection c);
Adding one collection data into another collection(Vector data intoArrayList) use following constructor.

Collections vs Autoboxing
Up to 1.4 version we must create wrapper class object then add that object into ArrayList.
import java.util.ArrayList;



Legacy classes:-
The java classes which are introduced in 1.0 version are called legacy classes and java.util package contains 5 legacy classes.
1) Dictionary
2) HashTable
3) Properties
4) Stack
5) Vector

Legacy interfaces:-
The java interfaces which are introduced in 1.0 version are called legacy interfaces and java.util 
	package contains only one interface is Enumeration.



Example:- Basic operations of ArrayList
add() 		-- to add the objects into ArrayList & by default it add the data at last but it is 
			   possible to insert the data at specified index.
remove() 	-- it removes Objects from ArrayList based on Object & index.
				(for the remove(10) method if we are passing integer value that is always treted as index )
size() 		--to find the size of ArrayList.
isEmpty() 	--to check the objects are available or not.
clear() 	--to remove all objects from ArrayList.
*/
//89
package com06.set;

import java.util.HashSet;

public class Manager13 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(90);
		set.add(90);
		set.add(90);
		set.add(90);
		System.out.println(set.size());
		System.out.println(set);
	}
}
/*
1) Introduced in 1.2 version.
2) Heterogeneous objects are allowed.
3) Duplicate objects are not allowed if we are trying to insert duplicate values then 
	we won't get any compilation & Execution errors simply add method returns false .
4) Null insertion is possible but if we are inserting more than one null it return only 
	one null value (because duplicates are not allowed).
5) The under laying data structure is HashTable.
6) Insertion order is not preserved it is based on the hash code of the object (hashing mechanism).
7) Methods are non-synchronized.
8) It supports only Iterator cursor to retrieve the data.

Note :- 
	The Set interface and HashSet,LinkedHashSet class does not contains new methods it 
		uses super class methods if we want check the predefined support by using javap command.
	Javap java.util.Set
	Javap java.util.HashSet
	javap java.util.LinkedHashSet
		
constructors:-
HashSet(); it creates default HashSet.

HashSet(java/util/Collection<? extends E>);
	It initialize the HashSet by passing another collection data.
HashSet(int capacity);
	It create the HashSet by specified capacity. And the default capacity of HashSet is 16.
HashSet(int capacity,float fillRatio);
	It initialize both capacity and filtration(also called as load factor) 
		and filtration must be 0.0 to 1.0 after filling this ratio a new HashSet object is created.
	The default fill ratio is 0.75.
*/
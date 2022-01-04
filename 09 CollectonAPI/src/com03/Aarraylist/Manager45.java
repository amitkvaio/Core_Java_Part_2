//Important note for Comprable and Comprator interface
package com03.Aarraylist;

public class Manager45 {

}
/*
Comparable vs Comparator :-
---------------------------
--	If we want to perform default natural sorting order then our objects must be homogeneous & comparable.
--	Comparable objects are nothing but the objects which are implements comparable interface.
--	All wrapper classes & String class are implementing Comparable interface hence 
		it is possible to perform sorting.
--	If we want to sort user defined class like Emp based on eid or ename with 
		default natural sorting order then your class must implements Comparable interface.
-	Comparable interface present in java.lang package it contains only one method 
		compareTo(obj) then must override that method to write the sorting logics.

	public abstract int compareTo(T);
--	If your class is implementing Comparable interface then that objects are 
		sorted automatically by using Collections.sort(). And the objects are sorted by using compareTo() method of that class.


Java.util.Comparator :-
----------------------
--For the default sorting order use comparable but for customized sorting order we can use Comparator.
--The class whose objects are stored do not implements this interface some third 
	party class can also implements this interface.
--Comparable present in java.lang package but Comparator present in java.util package.
--Comparator interface contains two methods,
	public interface java.util.Comparator<T> {
	public abstract int compare(T, T);
	public abstract boolean equals(java.lang.Object);
	}
*/

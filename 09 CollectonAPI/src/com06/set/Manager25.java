//101
package com06.set;

import java.util.TreeSet;

public class Manager25 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("add");
		set.add("abc");
		set.add("test");
		set.add("done");
		set.add("praveen");
		// set.add(null);
		System.out.println(set);
	}
}
/*
--	Sorting the string object using TreeSet
--	When we insert the data in TreeSet, by default it prints the data in 
		sorting order(ascending or alphabetical order) because it is implementing SortedSet interface.
--	To perform the sorting internally it uses compareTo() method and it compare the two objects it returns int value as a return value.
		“ratan”.compareTo(“anu”) ==> +ve ==>change the order
		“ratan”.compareTo(“ratan”) ==> 0 ==>no change
		“anu”.compareTo(“ratan”) ==> -ve ==>no change

-- If the TreeSet contains data if we are trying to insert null value at the time of 
	comparison JVM will generate //java.lang.NullPointerException.
-- In java any object with comparison of null it will generate java.lang.NullPointerException.

Note : 
	From 1.7 onwards null is not at all accepted by TreeSet. 
		If we enforce to add then we will get NullPointerException. Till 1.6 null was accepted only as the first element.
	
		
*/
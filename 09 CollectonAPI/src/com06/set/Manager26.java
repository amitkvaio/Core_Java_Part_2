//102
package com06.set;

import java.util.Collections;
import java.util.TreeSet;

public class Manager26 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(Collections.reverseOrder());
		set.add(1.9);
		set.add(1.0);
		set.add(9.0);
		set.add(1.2);
		set.add(2.1);
		set.add(5.3);
		set.add(9.2);
		set.add(2.4);
		// set.add(1); //all elements must be of same type to compare also null value
		// not allowed
		System.out.println(set);
	}
}
/*

-- TreeSet allows homogeneous data, if we are trying to insert heterogeneous data while performing sorting by 
	using compareTo() JVM will generate java.lang.ClassCastException 
	(because it is not possible to compare integer data with String) .


*/
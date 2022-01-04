//117
package com08.treemap;

import java.util.TreeMap;

public class Manager02 {
	public static void main(String[] args) {
		TreeMap map1 = new TreeMap();
		map1.put(12, "abc");
		map1.put(1, "test");
		map1.put(2, 9);
		map1.put(0, 3);
		map1.put(5, 2);

		System.out.println("Map:" + map1);
	}
}
/*
 -- Treemap allows homogeneous data, if we are inserting heterogeneous data while performing 
 		sorting it will generate java.lang.ClassCastException
*/
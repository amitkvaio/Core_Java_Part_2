//18
package com08.treemap;

import java.util.TreeMap;

public class Manager03 {
	public static void main(String[] args) {
		TreeMap map1 = new TreeMap();
		map1.put(80, "abc");
		map1.put("abc", "abc");
		System.out.println("Map:" + map1);
	}
}

/*
-- Treemap allows homogeneous data, if we are inserting heterogeneous data while performing 
		sorting it will generate java.lang.ClassCastException
*/
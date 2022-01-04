//116
package com08.treemap;

import java.util.HashMap;
import java.util.TreeMap;

public class Manager01 {
	public static void main(String[] args) {
		HashMap map1 = new HashMap<>();
		map1.put("key", 2000);
		map1.put("abc", 2300);
		map1.put("hello", 2050);
		map1.put("done", 9090);
		map1.put("check", 9190);
		map1.put("test", 9030);
		map1.put("java", 9091);
		System.out.println("Map:" + map1);

		TreeMap map2 = new TreeMap(map1);
		System.out.println("Map2:" + map2);

	}
}
/*
 -- In treemap when we insert the data that will be printed in sorting order based on key.
 -- Treemap allows homogeneous data, if we are inserting heterogeneous data while performing 
 		sorting it will generate java.lang.ClassCastException
 -- If the treemap contains data then we are adding null value hence while performing sorting it will 
 		generate java.lang.NullPointerException(any object with comparing of null it will generate NullPointerException )
Java.util.TreeMap:-
public class java.util.TreeMap extends java.util.AbstractMap
implements java.util.NavigableMap,java.lang.Cloneable, java.io.Serializable

1) This class is introduced in 1.2 version.
2) It allows homogeneous data if we are trying to insert heterogeneous data at 
	runtime while perform sorting JVM will generate ClassCastException.
3) Duplicate keys are not allowed but values can be duplicated.
4) Insertion order is not preserved it is based on some sorting order of keys.
5) The underlying data structure is red-black trees.
6) For empty treeset it is possible to insert null key once, 
	but if the treeset contains data if we are inserting null keys at runtime we will get NullPointerException 
	but for the values any number of null values insertion possible.

Note : 
	From 1.7 onwards null is not at all accepted by TreeSet. 
		If you enforce to add then we will get NullPointerException. Till 1.6 null was accepted only as the first element.
	
Constructors:-
------------
TreeMap();
	it will create empty treemap that will be sorted by using natural order of its keys.
TreeMap(java/util/Comparator<? super K>);
	It create treemap that will be sorted by using customized sorting oder.
TreeMap(java/util/Map<? extends K, ? extends V>);
	It create the treemap with specified data.
TreeMap(java/util/SortedMap<K, ? extends V>);
	It creates the treemap by initializing sortedmap data.
*/

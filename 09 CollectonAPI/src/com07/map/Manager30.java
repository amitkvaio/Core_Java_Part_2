//106
package com07.map;

import java.util.Collections;
import java.util.HashMap;

public class Manager30 {
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put("a1", "praveen");
		map1.put("a2", "ravi");
		map1.put("a3", "navi");
		map1.put("a5", "sonu");
		System.out.println(map1);
	}
}
/*
	Java.util.HashMap:-
	public class java.util.HashMap extends java.util.AbstractMap
	implements java.util.Map
	java.lang.Cloneable,
	java.io.Serializable
	
1) introduced in 1.2 version.
2) Heterogeneous data allowed.
3) Underlying data Structure is HashTable.
4) Duplicate keys are not allowed but values can be duplicated.
5) Insertion order is not preserved it is based on hashcode.
6) Null is allowed for key(only once)and allows for values any number of times.
7) Every method is non-synchronized so multiple Threads are operate at a time hence permanence is high.

Constructors:-
-------------
HashMap(); it creates default HashMap.
HashMap(java/util/Map<? extends K, ? extends V> var);
	it creates the HashMap by initializing the values specified in var.
HashMap(int capacity);
	It creates the hashmap with specified capacity but the default capacity is 16.
HashMap(int capacity, float fillRatio);
	It creates the hashMap with specified capacity & fillRatio.(default capacity is 16 & default fill ratio 0.75)

Entry:-
-- The each and every key value pair is called Entry.
-- The Map contains group of entries.
-- Entry is sub interface of Map interface hence get the entry interface by using Map interface.
	interface Map
	{ 
		interface Entry
		{ 
			public abstract Object getKey();
			public abstract Object getValue();
			public abstract Object setValue();
		}
	}
-- To get all the keys use keyset() method.
		public java/util/Set<K> keySet();
-- To get all the values use values() method.
		public java/util/Collection<V> values();
-- To get all the entries use entrySet() method.
		public java/util/Set<java/util/Map$Entry<K, V>> entrySet();
*/
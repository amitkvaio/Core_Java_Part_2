//112
package com07.map;

import java.util.Hashtable;

public class Manager36 {
	public static void main(String[] args) {
		Hashtable tab = new Hashtable();
		tab.put("k1", "e1");
		tab.put("k2", "e2");
		tab.put("k3", "e3");
		tab.put("k2", "e22");// values getting override
		tab.put("k4", "e2");
		System.out.println(tab);
		System.out.println(tab.get("k2"));
		System.out.println(tab.get("k4"));
		System.out.println("+1".concat("123456789"));
	}
}
/*
Java.util.HashTable:-
	public class java.util.Hashtable extends java.util.Dictionary
	implements java.util.Map,java.lang.Cloneable, java.io.Serializable
	
1. Introduced in the 1.0 version it’s a legacy class.
2. Heterogeneous data allowed for both key & value.
3. Duplicate keys are not allowed but values can be duplicated.
4. Every method is synchronized hence only one thread is allowed to access it is a 
	Thread safe but performance is decreased.
5. Null is not allowed for both key & Value , if we are trying to insert null values we will get NullPointerException.
6. HashTable was made generic by JDK5.
7. The underlying data structure is hash table.

Constructors:-
HashTable(); it creates default HashMap.

HashTable (java/util/Map<? extends K, ? extends V> var);
	it creates the HashMap by initializing the values specified in var.

HashTable (int capacity);
	It creates the hashmap with specified capacity but the default capacity is 11.

HashTable (int capacity, float fillRatio);
	It creates the hashMap with specified capacity & fillRatio.(default capacity is 11 & default fill ratio 0.75)


*/
//93
package com06.set;

import java.util.HashSet;

public class Manager17 {
	public static void main(String args[]) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add(10);
		set.add(19);
		set.add(9);
		set.add(90);
		set.add(93);
		set.add(91);
		System.out.println(set);
	}
}
/*
Insertion order of set we  can not be predict
Insertion order is not preserved it is based on the hash code of the object (hashing mechanism).
*/
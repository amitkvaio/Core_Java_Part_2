//99 Iterating the HashSet object using the Iterator interface
package com06.set;

import java.util.HashSet;
import java.util.Iterator;

public class Manager23 {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();
		set.add(123);
		set.add("23");
		set.add("abc");
		set.add("123");
		set.add(true);
		set.add('a');
		System.out.println(set);
		Iterator<Object> it = set.iterator();
		System.out.println("----------");
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.println();
	}
}

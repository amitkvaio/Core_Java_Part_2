//write a program to insert String data into TreeSet to perform sorting in reverse of alphabetical order.
package com06.set;

import java.util.Comparator;
import java.util.TreeSet;

class B implements Comparator<String> {
	@Override
	public int compare(String st1, String st2) {
		return st1.compareTo(st2); // [apple, banana, cucumber, orange, papaya]
		// return st2.compareTo(st1);//[papaya, orange, cucumber, banana, apple] -
		// reverse order

	}
}

public class Practice01 {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new B());
		t.add("orange");
		t.add("banana");
		t.add("apple");
		t.add("papaya");
		t.add("cucumber");
		System.out.println(t);
	}
}

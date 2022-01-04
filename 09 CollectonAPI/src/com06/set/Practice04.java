//Example:- passing sorted set object to TreeSet constructor.
package com06.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Practice04 {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(20);
		t.add(40);
		t.add(10);
		t.add(30);
		System.out.println(t); // 10 20 30 40

		SortedSet s = t.headSet(40);
		System.out.println("S-->" + s);
		TreeSet tt = new TreeSet(s);
		System.out.println(tt); // 10 20
	}
}

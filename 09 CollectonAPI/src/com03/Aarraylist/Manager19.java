//55
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Manager19 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(8.9);
		list.add(9);
		list.add(9.0);
		list.add(9.1);

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
/*
-- Sorting should be one type of elements.
-- if the multiple type of elements are there in the arrayList then it will
	throw an exception saying java.lang.ClassCastException.
*/
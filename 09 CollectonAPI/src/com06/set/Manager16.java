//92
package com06.set;

import java.util.HashSet;

public class Manager16 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(null);
		set.add("90");
		set.add(90.0);
		System.out.println(set);
	}
}
/*
	Adding the different data type object
	Integer
	String
	Double
	But its looks like same number we are inserting to the set
*/
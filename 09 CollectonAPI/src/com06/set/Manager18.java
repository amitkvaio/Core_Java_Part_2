//94
package com06.set;

import java.util.HashSet;

public class Manager18 {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add("abc");
		set1.add("abc");// avoiding duplicate
		System.out.println(set1);

		HashSet set2 = new HashSet();
		set2.add(90);
		set2.add(90);
		set2.add(90);// avoiding duplicate
		System.out.println(set2);

		HashSet set3 = new HashSet();
		set3.add(true);
		set3.add(true);// avoiding duplicate
		System.out.println(set3);

		HashSet set4 = new HashSet();
		set4.add(new StringBuffer("abc"));
		set4.add(new StringBuffer("abc"));// not avoiding duplicate
		System.out.println(set4);

		HashSet set5 = new HashSet();

		set5.add(new A(10));// not avoiding duplicate set5.add(new A(10));
		set5.add(new A(10));
		System.out.println(set5);

	}
}
/*
-- in all the wrapper classes equal() and hashcode() method
	both method are override, due to that HashSet is able
	to identify the duplicate object.
--  But in the StringBuffer class equal and hascode method are not overrided.
	due to that HashSet is not able to identify the duplicate object.

*/
package com.tricky;

public class Test04 {
	public static void main(String[] args) {
		Integer a = 1000, b = 1000;
		System.out.println(a == b);

		Integer c = 100, d = 100;
		System.out.println(c == d);
	}
}

/*

JVM’s cache behavior can be confusing, so this question tests that concept. 
	The second output is true as we are comparing the references, because the JVM tries 
	to save memory when the Integer falls within a range (from -128 to 127). 

At point 2, no new reference of type Integer is created for ‘d’. 
Instead of creating a new object for the Integer type reference variable ‘d’, 
it is only assigned with a previously created object referenced by ‘c’. 

All of these are done by JVM.


*/
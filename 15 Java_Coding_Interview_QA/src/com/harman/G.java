// Tricky question  : https://javaconceptoftheday.com/why-128-128-returns-false-in-java/
package com.harman;

public class G {
	public static void main(String[] args) {
		int a = 127, b = 127, c = 100, d = 100, e = 198, f = 198;
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(e == f);
		System.out.println("------Wrapper------");
		Integer r1 = 127, r2 = 127, r3 = 100, r4 = 100, r5 = 101, r6 = 101;
		System.out.println(r1 == r2);
		System.out.println(r3 == r4);
		System.out.println(r5 == r6);
	}
}


/*
-128 t0 127 

*/


























/*
Integer.ValueOf() method creates the java.lang.Integer object by passing the specified ‘int‘ value. 
	Actually, it doesn’t create the new objects for all the values you pass. 
	This method is implemented such that the frequently used values are cached. 
	
I.e. internally it maintains an array of Integer objects where Integer objects for frequently 
	requested values are created and stored at the time of VM initialization itself. 

By default, these values will be from -128 to 127. So, for any number you pass between -128 and 127 (inclusive), 
	it doesn’t create the new Integer object. Instead it returns already cached object from the array. 
	If you pass the number beyond this range, then only it creates a new Integer object. 
	Below is the source code of Integer.valueOf() method.

*/
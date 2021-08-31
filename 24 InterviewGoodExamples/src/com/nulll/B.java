package com.nulll;

public class B {
	private static Object obj;
	public static void main(String args[]) {
		// it will print null;
		System.out.println("Value of object obj is : " + obj);
	}
}
/*
ii. Reference Variable Value
Any reference variable automatically has a null value

iii. Type of Null in Java
Java Null is just a special value, it is neither an object nor a type.

Example –
String str = null;
Integer itr = null;
Double dbl = null;
String myStr = (String) null;
Integer myItr = (Integer) null;
Double myDbl = (Double) null;

*/
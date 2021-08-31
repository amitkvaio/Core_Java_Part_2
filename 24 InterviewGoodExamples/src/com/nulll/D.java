package com.nulll;

public class D {
	public static void main(String[] args) throws java.lang.Exception {
		Integer i = null;
		Integer j = 10;
		//prints false
		System.out.println(i instanceof Integer);
		//Compiles successfully
		System.out.println(j instanceof Integer);
	}
}
/*
v. Instanceof Operator in Java

At runtime the instanceof operator in Java is true if an expression is Java null, 
it checks for the type of instance of the object.
*/

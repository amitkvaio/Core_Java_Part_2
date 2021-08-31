package com.nulll;

public class C {
	public static void main(String[] args) throws java.lang.Exception {
		Integer i = null;
		int a = i;
	}
}
 
/*
iv. Autoboxing and Unboxing in Java
An error is thrown if the null value is assigned to a primitive data type in Java.

Exception in thread "main" java.lang.NullPointerException
	at com.nulll.C.main(C.java:6)

*/
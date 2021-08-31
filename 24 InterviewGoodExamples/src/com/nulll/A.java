package com.nulll;

public class A {
	public static void main(String[] args) throws java.lang.Exception {
		// compile-time error : can't find symbol 'NULL'
		// Object obj = NULL;
		// runs successfully
		Object obj1 = null;
	}
}

/*

i. Java Null is Case Sensitive
It is a literal and in Java keywords are case sensitive, so we do not write it as NULL or 0 as we would in C.
First thing, first, null is a keyword in Java, much like public, static or final. 
It's case sensitive, you cannot write null as Null or NULL, compiler will not recognize them and give error.

*/

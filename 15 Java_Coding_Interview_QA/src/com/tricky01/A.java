package com.tricky01;

public class A {
	public static void main(String[] args) {
		foo(null);
	}

	public static void foo(Object o) {
		System.out.println("Object impl");
	}

	public static void foo(String s) {
		System.out.println("String impl");
	}

	/*public static void foo(StringBuffer i) {
		System.out.println("StringBuffer impl");
	}*/
}
/*
As we know that we can assign null to any object, so doesn’t compiler complains about this program? 
According to java specs, in case of overloading, compiler picks the most specific function. 
Obviously String class is more specific than Object class, hence it will print “String impl”.

After overriding below method adding below method
public static void foo(StringBuffer i) {
		System.out.println("StringBuffer impl");
	}
CTE 
In this case, java compiler will throw an error as “The method foo(String) is ambiguous 
for the type Test” because String and StringBuffer, none of them are more specific to others. 

A method is more specific than another if any invocation handled by the first method could be 
passed on to the other one without a compile-time type error. 

*/

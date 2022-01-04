//132
package com10.generic;

class C<X> {
	X i;
}

class Manager02 {
	public static void main(String[] args) {
		C<String> c1 = new C<String>();
		c1.i = "abc";

		C<Integer> c2 = new C<Integer>();
		c2.i = 20;

		C<Boolean> c3 = new C<Boolean>();
		c3.i = true;

		C<Double> c4 = new C<Double>();
		c4.i = 10.36;

		C<Character> c5 = new C<Character>();
		c5.i = 'A';

		System.out.println("done02");
	}
}
/*
-- class C contain one attribute data type is X
-- X is specified as generic type and it is written in the angle bracket
-- i data type is varying from one object to another object.
-- i data type is not fixed so i is generic type.
-- while creating the object we are specifying the data type of the attribute.
-- it is nothing but we are specifying the generic type.
-- Generic type can be specified through the identifier.
-- Here identifier is X
-- Object wise data type is varying through the generic.
-- while creating an object of class C we have to specify the what is the data type of X
-- Generic are introduced in JDK 1.5
-- Generic data type is only being used for non static or member of the object.
-- non static attribute, non static method argument, non static method return type,Local Variable
   Constructor argument may be the generic.
-- Generic can not be used static member - CTE
-- Object wise we are able to change the data type using Generic
-- for the same class we can use for different data type of the object
*/
//138
package com10.generic;

class I<X> {
	X f1;
}

class Manager08 {
	public static void main(String[] args) {
		I obj1 = new I();
		I<String> obj2 = new I<String>();

		obj1.f1 = new Object();
		obj2.f1 = "abc";
		System.out.println("done");
	}
}
/*
-- default generic type will be Object type
-- we are not supplying  X type. then it is qualifying as Object type
-- in case of Generic if we have not specified the data type then it will take the data type as Object.
*/

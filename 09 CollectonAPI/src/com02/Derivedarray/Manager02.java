//26
package com02.Derivedarray;

import java.util.Arrays;

class B {
	int i;

	B(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "i =" + i;
	}
}

class C1 {
	int i;

	C1(int i) {
		this.i = i;
	}
}

public class Manager02 {
	public static void main(String[] args) {
		B x[] = new B[2];
		x[0] = new B(90);
		x[1] = new B(190);

		B y[] = { new B(9), new B(80) };

		C1 Z[] = { new C1(100), new C1(200) };

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(Z));

	}
}

/*
 if we commented the toString() then it will call the toString() of the 
 	Object class and return the class name with the hexadecimal 
 	representation of the object.
 
 Arrays.toString(x)
 //it will print the content of the respective arrays.

 */

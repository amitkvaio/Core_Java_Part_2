//25
package com02.Derivedarray;

import java.util.Arrays;

class A {
	int i;

	A(int j) {
		this.i = j;
		// i is getting initialized
	}
	@Override
	public String toString() {
		return "i=" + i;
	}
}

public class Manager01 {
	public static void main(String[] args) {
		A x[] = new A[2];
		x[0] = new A(90);
		// first it call the constructor and initialize the 90 to i
		x[1] = new A(10);

		System.out.println(x);// call the object class toString()- will print the memory address
		System.out.println(x.toString());
		System.out.println(Arrays.toString(x)); // calling array class toString();
		// it will print the content of the respective arrays.

		System.out.println("**********************");
		Integer a[] = new Integer[2];
		a[0] = 9;
		a[1] = 10;
		System.out.println("a[]->" + a);
		System.out.println("a[]->" + a.toString());
		System.out.println(Arrays.toString(a));
	}
}

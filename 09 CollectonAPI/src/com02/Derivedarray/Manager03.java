//27
package com02.Derivedarray;

import java.util.Arrays;

class C {
	int i;

	C(int i) {
		this.i = i;
	}

	public String toString() {
		return "i=" + i;
	}
}

public class Manager03 {
	public static void main(String[] args) {
		C x[] = new C[4];
		x[0] = new C(9);
		x[1] = new C(5);
		x[2] = new C(7);
		x[3] = new C(4);
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}

/*
 Why unable to sort C type array element?
 ----------------------------------------
 
 If it is primitive type then sorting operation will successfully
 whenever we want to sort derived data type then class type should be 
 	comparable type.
 Comparable is one interface which is used for shorting purpose.
 
 java.lang.classCastException class C can not be converted into comparable type.
 Arrays element should be comparable type if its data type is derived data type.
*/

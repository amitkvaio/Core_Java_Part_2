//shallow copy
package com.clone.shallowCopy;

public class ShallowCopy {
	public static void main(String[] args) {
		A a = new A(10);
		B b1 = new B(20, a);
		B b2 = null;

		try {
			// Creating clone of b1 and assigning it to b2
			b2 = (B) b1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Onject is not clone-able");
		}

		// Printing value of b1.a.i
		System.out.println(b1.a.i); // Output : 10
		
		// Changing the value of b2.a.i to 100
		b2.a.i = 100;
		
		// This change will be reflected in original object 'b1'
		System.out.println(b1.a.i); // Output : 100
	}
}

/*
 * In shallow copy operation, any changes made to clone will be reflected in the
 * original or vice-versa. This happens when an object has reference variables
 * as fields.
 * The default version of clone() method implements the shallow copy.
 */

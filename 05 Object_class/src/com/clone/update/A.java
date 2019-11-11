//how to create a clone of an object using clone() method.
package com.clone.update;

class B implements Cloneable{
	int i;

	int j;

	public B(int i, int j) {
		this.i = i;

		this.j = j;
	}

	// Overriding clone() method

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class A {
	public static void main(String[] args) {
		
		B b1 = new B(10, 20);

		// Declaring reference variable of Class B and assigning null to it

		B b2 = null;

		// enclosing a1.clone() in try-catch blocks
		// as clone() throws CloneNotSupportedException

		try {
			// Creating a clone of a1 and assigning it to a2
			b2 = (B) b1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Object is not clone-able");
		}

		System.out.println(b2.i); // Output : 10
		System.out.println(b2.j); // Output : 20
		
	}
}

package com.tricky01;

public class C {
	public static void main(String[] args) {
		System.out.println("From C class");
		System.out.println(D.HUMAN_AVERATE_AGE);
	}

	static {
		System.out.println("Static block from the C class");
	}

}

class D {
	static final int HUMAN_AVERATE_AGE = 90;
	static {
		System.out.println("Static block from D class");
	}
}
/*
 * While compiling, Java compiler replace the final variable with the original
 * values so while running the C class - D class not required to load in the
 * memory due to that static block of D class not execute.
 */
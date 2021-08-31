package com.nulll;

public class E {
	public static void main(String args[]) {
		E obj = null;
		obj.staticMethod();
		obj.nonStaticMethod();
	}

	private static void staticMethod() {
		System.out.println("static method, can be called by null reference");
	}

	private void nonStaticMethod() {
		System.out.print(" Non-static method- ");
		System.out.println("cannot be called by null reference");
	}
}

/*
 * vi. Static vs. Non-static Methods in Java vi. Static vs. Non-static Methods
 * in Java A non-static value cannot be called by a null value, it will throw a
 * NullPointerException, but this won’t happen with a static method.
 * 
 */

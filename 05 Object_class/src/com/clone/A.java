package com.clone;

public class A implements Cloneable {

	int i;

	public static void main(String[] args) throws CloneNotSupportedException {
		A a1 = new A();
		a1.i = 10;
		Object obj = a1.clone();
		A a2 = (A) obj;
		
		System.out.println("a1.i :->"+a1.i);
		System.out.println("a2.i :->"+a2.i);
		
		a2.i=200;
		System.out.println("After changing values in a1.i");
		System.out.println("a1.i :->"+a1.i);
		System.out.println("a2.i :->"+a2.i);
		
		System.out.println("done");

	}

}
/*
 * 
 * changing in the cloned object is not reflected back to the original and
 * changing in the original is not reflected bank to the cloned here we are
 * achieving the deep copy
 */
package com.clone;

public class B implements Cloneable
{
	int i;

	public static void main(String[] args) throws CloneNotSupportedException
	{
		B b1 = new B();
		//b1.i=10;
		B b2 = (B)b1.clone();
		System.out.println("b2.i="+ b2.i);
		b2.i= 20;
		System.out.println("b1.i="+ b1.i);
		b1.i=30;
		System.out.println("b2.i="+b2.i);
		System.out.println("b1.i="+b1.i);
	}

}

/*
 * 
 * changing in the cloned object is not reflected back to the original and
 * changing in the original is not reflected bank to the cloned here we are
 * achieving the deep copy
 */
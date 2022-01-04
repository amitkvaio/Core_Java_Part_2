//12
package com01.Arrays;

public class M {
	public static void main(String[] args) {
		int[] x = new int[2];
		int[] y = x;
		Object obj = y;
		int[] z = (int[]) obj;
		System.out.println(x.length + " " + y.length + " " + z.length);
		System.out.println("Done");
	}
}












//every class is the subclass is the object class
/*
x reference is assign to y integer array both are homogeneous type
again y is assign into obj , but here obj is Object type not integer array type 
so before assign obj in any of the integer array we have to downcast into int array type.


*/
package com.lara1;

public class N {
	public static void main(String[] args) {
		String s1 = null;
		// System.out.println(s1.toString());//java.lang.NullPointerException
		// override the toString() in the Object class
		// 1s1=null+null;
		System.out.println(s1);
	}
}
/*
 * + operator required at least one operand as String type then only it is
 * treated as string
 * 
 * In Java(tm), "null" is not a keyword, but a special literal of the null type. 
 * 	It can be cast to any reference type, but not to any primitive type such as int or boolean. 
 * 		The null literal doesn't necessarily have value zero. 
 * 			And it is impossible to cast to the null type or declare a variable of this type.
 */
//145
package com10.generic;

class W<A> {
	A i;
}

public class Manager15 {
	public static void main(String[] args) {
		W<?> obj1 = new W<Integer>();
//		obj1.i=10;

		obj1 = new W<String>();
//		obj1.i="abc";

		obj1 = new W<Double>();
//		obj1.i=20.90;

		W<Integer> obj2 = new W<Integer>();
		obj2.i = 1000;

		W<? extends Number> obj3 = null;
		obj3 = new W<Integer>();
//		obj3.i=10;
//		obj3.i = new Object();

		W<? super Number> obj4 = null;
		obj4.i = 10;
		obj4.i = 20.4;
		obj4.i = Object("abc");

		W<? super Q> obj5 = null;
		obj5 = new W<Q>();
		obj5.i = new Q();
		obj5.i = new R();
		obj5.i = new S();
//		obj5.i=new P();
//		obj5.i=new Object();

		W<? extends P> obj6 = null;
		obj6 = new W<R>();
//		obj6.i = new S();

		W<?> obj7 = null;
		obj7 = new W<S>();
//		obj7.i = new S();

		System.out.println("Done");
	}

	private static Number Object(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
/*
 * -- W<?> obj1 = new W<Integer>(); obj1.i=10; -- obj1 is W of question mark -
 * it is eligible to initialize without any data type. -- compiler is checking
 * what is obj1 data type - it is W of question mark. -- inside obj1 - i data
 * type is not fixed - then we can not initialize with any value. -- if the left
 * hand side allow the multiple data type then compiler got confused - CTE --
 * ************ W<Integer> obj2 = new W<Integer>(); obj2.i=1000; -- obj2 data
 * type is fixed - CTS.
 *****************
 * W<? extends Number> obj3 = null; -- Number or subclass of Number. -- for any
 * of the class we can not estimate the total number of subclass. -- There are
 * no mechanism to find the total number of subclass of any class. -- obj3 = new
 * W<Integer>(); obj3.i - i data type is not fixed even though obj3 is pointing
 * to the integer - CTE
 ***********************
 * W<? super Number> obj4 = null; -- obj4 can be initialized with a number of
 * super class of Number -- there is end of super class. -- we can not find out
 * list of subclasses. -- Object is the super class of Number either Number or
 * Object are allowed
 ****************
 * W<? super Q> obj5 = null; -- ob4 can be initialized with Q or super class of
 * Q
 *****************
 * W<? extends P> obj6 = null; -- obj6 can be initialized with P or subclass of
 * P
 *****************
 * W<?> obj7 = null; -- same as obj1;
 * 
 */
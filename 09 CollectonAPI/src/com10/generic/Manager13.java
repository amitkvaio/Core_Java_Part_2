//143
package com10.generic;

class TT<A> {
	A a1;
}

public class Manager13 {
	public static void main(String[] args) {
		TT<?> t1 = null;
		t1 = new TT<Integer>();
		t1 = new TT<Number>();
		t1 = new TT<Object>();
		t1 = new TT<String>();
		t1 = new TT<S>();
		
		TT<? extends Number> t2 = null;
		t2 = new TT<Integer>();
		t2 = new TT<Number>();
//		t2 = new T<Object>();
//		t2 = new T<String>();
//		t2 = new T<S>();
		
// Object ,String and S is not the subclass of Number class		
		
		TT<? super Number> t3 = null;
		t3 = new TT<Number>();
		t3 = new TT<Object>();
//		t3 = new T<Integer>();
//		t3 = new T<String>();
//		t3 = new T<S>();
		
		
		T<? extends R> t4 = null;
		t4 = new T<R>();
		t4 = new T<S>();
//		t4 = new T<P>();
//		t4 = new T<Q>();
//		t4 = new T<Object>();
//		t4 = new T<String>();
//		
		
		TT<? super Q > t5 = null;
		t5 = new TT<P>();
		t5 = new TT<Q>();
		
		System.out.println("done");
	}
}
/*
-- TT<?> t1 = null;
-- <?> it is declare as a wild card.
-- it is a while card character.
-- TT<?> = null  - we are not passing any data type - so while creating the object of Class T.
   We can pass any data type- Integer, Number, Object, String.
-- TT<String> =null -  while creating the object of T - we can pass only String type.
-- ***********************
-- TT<? extends Number> t2 = null;- only able to pass Number type - no other data type
-- while creating of object of t2 - we can only able to pass Number type or subclass of Number.
-- *********************
-- TT<? super Number> t3 = null;
-- Number or super class of Number - Number or Object type.
-- **********************
-- TT<? extends R> t4 = null;
-- R or sub class of R - R and S
-- **************************
-- TT<? super Q > t5 = null;
-- Q or super class of Q - we can not supply sub class of Q
-- P,Q - Object type

*/
//141
package com10.generic;

class T<A extends P> {
	A i;
}

class Manager11 {
	public static void main(String[] args) {
		T<P> t1 = new T<P>();
		T<Q> t2 = new T<Q>();
		T<R> t3 = new T<R>();
		T<S> t4 = new T<S>();
		// T<String> t5 = new T<String>();
	}
}
/*
P
^
|
Q
^
|
R
^
|
S
-- A extends P - means A becomes the super class and its having four child - P,Q,R and S
-- while creating the object of Class T we can able to supply either of four data type as given above.
-- why we can not able to supply String?
-- we can supply only either P or sub class of P - but here String is not the sub class of P
*/

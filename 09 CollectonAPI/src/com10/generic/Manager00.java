//130

package com10.generic;

class A {
	int i;
}

class Manager00 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		a1.i = 10;
		a2.i = 20;
		a3.i = 30;
		System.out.println("done");
	}
}

/*
-- what is the data type of i  = it is integer type.
-- i data type is fixed for all the three object of A
-- i data type is not varying from one object to another object - it fixed data type.
-- i is not generic type because its data type is fixed for all the object of class A
*/
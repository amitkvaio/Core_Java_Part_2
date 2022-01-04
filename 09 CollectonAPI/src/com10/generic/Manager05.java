//135
package com10.generic;

class F<Test> {
	Test i;//
	void method1(Test t) {
		System.out.println("From method1 : " + t + " i:" + i);
	}
}

class Manager05 {
	public static void main(String[] args) {
		F<String> f1 = new F<String>();

		F<Integer> f2 = new F<Integer>();

		f1.method1("abc");
		// f2.method1("xyz");
		f2.method1(100);
		System.out.println("done");
	}
}
/*
Test i - is the Generic type.
method1(-) taking the argument as generic type
we can pass any data type while creating the object of Class F
//f2.method1("xyz"); -  while creating the f2 object - we have pass Integer
	so we can pass only integer value but here we are passing as String - CTE
*/
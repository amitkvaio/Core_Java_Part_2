
package com.lara;

class A {

}

class B extends A {

}

public class M21 {
	public static void main(String[] args) {
		A a2 = new A();
		A a1 = new B();// auto upcasted into A type
		Object o1 = new A();// auto Upcasted into OBJECT TYPE.
		Object o2 = new B();

		System.out.println(a2);
		System.out.println(a1);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println("done");
	}
}

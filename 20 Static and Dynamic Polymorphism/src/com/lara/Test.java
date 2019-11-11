package com.lara;

class A {
	public void test1() {
		System.out.println("Test1 method of Class A");
	}
	
	public void test2() {
		System.out.println("Test2 method of Class A");
	}
}

class B extends A{
	@Override
	public void test1() {
		System.out.println(" Override Test1 method of Class B");
	}
	
	@Override
	public void test2() {
		System.out.println(" Override Test2 method of Class B");
	}
}

class C extends B{
	@Override
	public void test1() {
		System.out.println(" Override Test1 method of Class c");
	}
	
	@Override
	public void test2() {
		System.out.println(" Override Test2 method of Class c");
	}
}

public class Test {
	public static void main(String[] args) {
		A a1 = new C();
		a1.test1();
		a1.test2();
		A a2 = new B();
		a2.test1();
		a2.test2();
		A a3 = new A();
		a3.test1(); a3.test2();
	}
}

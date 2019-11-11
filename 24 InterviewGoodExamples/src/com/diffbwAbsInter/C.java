package com.diffbwAbsInter;

public class C extends B {

	@Override
	public void test5() {
		System.out.println("Overriding test5() method in Class C");
		
	}

	@Override
	public void test4() {
		System.out.println("Overriding test4() method in Class C");
	}
	
	public void test6() {
		System.out.println(" test6() method in Class C");
	}
	
	public static void main(String[] args) {
		System.out.println("****A a1 = new C();*****");
		A a1 = new C();
		a1.test1();
		a1.test2();
		a1.test3();
		a1.test4();
		
		System.out.println("*******B b1 = new C();*******");
		B b1 = new C();
		b1.test1();
		b1.test2();
		b1.test3();
		b1.test4();
		b1.test5();
		System.out.println("*********************");
		C c1 = new C();
		c1.test1();
		c1.test2();
		c1.test3();
		c1.test4();
		c1.test5();
		c1.test6();
	}
}

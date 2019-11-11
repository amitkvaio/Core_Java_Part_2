package com.tangoe;

public class Child2 extends Child1{
	
	@Override
	public void method2() {
		System.out.println("Child-2 class method2");
	}
	
	public void method5() {
		System.out.println("Child-2 class method5");
	}
	
	public void method6() {
		System.out.println("Child-2 class method6");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Parent <--- Child1");
		Parents p1 = new  Child1();
		p1.method1();
		p1.method2();
		//p1.method3();
		//p1.method4();
		
		System.out.println("Parent <--- Child2");
		Parents child = new Child2();
		child.method1();
		child.method2();
		//child.method3();
		//child.method4();
		//child.method5();
		//child.method6();
		
		System.out.println("Child1 <--- Child2");
		
		Child1 c1 = new Child2();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		//c1.method5();
		//c1.method6();
		
		System.out.println("----Child2 <---Child2----");
		
		Child2 child2 = new Child2();
		child2.method1();
		child2.method2();
		child2.method3();
		child2.method4();
		child2.method5();
		child2.method6();
	}
}

package com.tangoe;

public class Child1 extends Parents {
	@Override
	public void method1() {
		System.out.println("Child-1 class overide method 1");
	}
	
	public void method3() {
		System.out.println("Child-1 class  method 3");
	}
	
	public void method4() {
		System.out.println("Child-1 class  method 4");
	}
	
	public static void main(String[] args) {
		Parents p = new Child1();
		p.method1();
		p.method2();
		//p.method3();
		//p.method4();
	}
}

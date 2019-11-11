 package com.harman;

class Base{
	protected void foo() {
		System.out.println("Base");
	}
	protected void boo() {
		System.out.println("boo");
	}
	
}
public class E extends Base{
	@Override
	public void foo() {
		System.out.println("Drived");
	}
	
	@Override
	protected void boo() {
		System.out.println("boo");
	}
	
	public static void main(String[] args) {
		E d = new E();
		d.foo();
		d.boo();
	}
}

/*
	we can not override the given method with default or private access modifier
	if the super class method has the protected   modifier
	we can override with either same or public access modifier 

*/

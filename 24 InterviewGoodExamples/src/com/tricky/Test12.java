package com.tricky;

class Parent {
	static {
		System.out.println("Parent static");
	}
	{
		System.out.println("paretns-iib");
	}

	public Parent() {
		System.out.println("parent cosntr");
	}
}

class Child extends Parent {
	static {
		System.out.println("Child static");
	}
	{
		System.out.println("Child-iib");
	}

	public Child() {
		System.out.println("Child cosntr");
	}
}

public class Test12 {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("done");
	}
}

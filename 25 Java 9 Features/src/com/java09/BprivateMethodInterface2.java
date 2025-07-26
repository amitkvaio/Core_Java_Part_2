package com.java09;

interface YourInterface{
	public abstract void method1();
	
	public default void method2() {
		method4();
		method5();
		System.out.println("Default Method2");
	}
	
	public static void method3() {
		method5();
		System.out.println("Static method3");
	}
	
	private void method4() {
		System.out.println("Private Method4");
	}
	
	private static void method5() {
		System.out.println("Private static method5");
	}
}

public class BprivateMethodInterface2 {
	public static void main(String[] args) {
		YourInterface yourInterface = new YourInterface() {
			@Override
			public void method1() {
				System.out.println("From method1");
			}
		};
		yourInterface.method1();
		yourInterface.method2();
		YourInterface.method3();
		
	}
}

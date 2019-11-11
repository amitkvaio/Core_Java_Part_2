package com.tangoe;

public interface I1 {
	default void method1() {
		System.out.println("From I1 default method1 ");
	}
	
	default void method2() {
		System.out.println("From I1 default method2 ");
	}
}

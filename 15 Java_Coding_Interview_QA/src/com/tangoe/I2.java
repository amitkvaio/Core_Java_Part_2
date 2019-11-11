package com.tangoe;

public interface I2 {
	default void method3() {
		System.out.println("From I2 default method3 ");
	}
	
	default void method4() {
		System.out.println("From I2 default method4 ");
	}
	
	 static void method5() {
		System.out.println("From I2 default method5 ");
	}
}

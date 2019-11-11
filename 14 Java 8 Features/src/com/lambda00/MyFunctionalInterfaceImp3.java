package com.lambda00;

public class MyFunctionalInterfaceImp3 {
	public static void main(String args[]) {
		
		//lambda expression without using any parameter
		MyFunctionalInterface3 msg = (num) -> num+5;  
		System.out.println(msg.incrementByFive(10));
		
	}
}

package com.lambda00;

public class MyFunctionalInterfaceImp4 {
	public static void main(String args[]) {
		
		//lambda expression with using parameter
		MyFunctionalInterface4 msg = (str1,str2) -> str1+str2;  
		
		System.out.println(msg.sconcat("Hello ", "Amit"));
	}
}

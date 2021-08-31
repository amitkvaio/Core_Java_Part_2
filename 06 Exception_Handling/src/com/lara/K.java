package com.lara;
public class K {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10 / 0;
			System.out.println(3);
		} catch (ArithmeticException ex) {
			System.out.println(4);
			System.out.println(ex.getMessage());
			System.out.println(5);
		}
		System.out.println(6);
	}
}
/*
 After the exception occurred in the try block  remaining code will be not executed
 but in the catch block every stmt will be executed  even the code will be written after 
 	the sop of exception 
 stmt will be executed. 
 
 */
package com.dowhileloop;
/*
	if we want to execute the loop body at least one time then we should go for do-while loop
	in do-while first body will be executed then only condition will be checked.
	in do-while the while must be ends with semicolon otherwise compilation error.

*/
public class A {
	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println("do");
			i++;
		}while(i<5);
		System.out.println("END OF MAIN METHOD:");
	}
}

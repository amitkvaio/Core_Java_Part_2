package com.forloop;

//Compiler is able to identify the unreachable statement.
//CTE
public class M {
	public static void main(String[] args) {
		for (int i = 0; true; i++) {
			System.out.println("Amit");
		}
		//System.out.println("********Unreachable statement********");
	}
}

/*
When we provide the condition even thought that condition is represent infinite loop compiler
is unable to find unreachable statements because that compiler is thinking that condition may fail.

when we provide boolean values as a condition then compiler is identifying unreachable statement because
compiler knows that condition never change.


*/
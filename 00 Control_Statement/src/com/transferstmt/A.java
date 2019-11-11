package com.transferstmt;
/*
	by using transfer statements we are able to transfer the flow of execution from one position to another position.
	break, continue
	
	break;
	break is used to stop the execution.
	And it possible to use the break statement only two areas.
	1 inside the switch statements.
	2. inside the loops.
	if we are using any other place then the compiler will generate the compilation error message
	"break outside switch or loop"
*/
public class A {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("**OUTSIDE IF BLOCK**");
			if(i==5){
				break;
				//System.out.println(i);// UNREACHABLE CODE
			}
		}
		System.out.println("****MAIN METHOD END****");
	}
}

package com.forloop;

//inside the for loop increment/decrement part is optional if we are not providing condition at the time of 
//compilation compile will provide true value.
public class H {
	public static void main(String[] args) {
		for (int i = 0;i<5;) {
			System.out.println("inside the for loop conditional part is optional");// infinite loop
		}
	}
}
/*
	i<5 is always true because i=0 is not increment/decrement so i value is always zero
	and i<5 become always true
	so it will execute the infinite loop
*/

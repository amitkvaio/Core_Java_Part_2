package com.recursion;
//find the nth fibonacci number
public class Recursion01 {
	public static void main(String[] args) {
		System.out.println(fibonacciNumber(4));
	}
	
	public static int fibonacciNumber(int num) {
		//Base case
		if(num==0) {
			return 0;
		}
		if(num==1) {
			return 1;
		}
		int smallOutput1 = fibonacciNumber(num-1);
		int smallOutput2 = fibonacciNumber(num-2);	
		return smallOutput1+smallOutput2;
	}
}
/*
0 1 1 2

*/
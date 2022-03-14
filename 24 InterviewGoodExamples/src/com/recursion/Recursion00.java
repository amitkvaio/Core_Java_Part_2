package com.recursion;
//Factororial
public class Recursion00 {
	public static void main(String[] args) {
		int num = -13;
		int fact = factorial(num);
		if(fact ==-1) {
			System.out.println("Factorial of " +num +" is not possible pls choose other number!");
		}else {
			System.out.println("Factorial of " + num + " is: "+fact);
		}
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		if (n < 0) {
			return -1;
		}
		int smallOutput = factorial(n-1);
		int output = n * smallOutput;
		return output;
	}
}

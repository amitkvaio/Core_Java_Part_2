package com.tricky;

//Fibonacci Series
public class Test08 {
	public static void main(String[] args) {
		fibonacciSeries(10);
	}

	public static void fibonacciSeries(int num) {
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 0; i <= num; i++) {
			System.out.print(a+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}
}

package com.tricky;

//Java program to check if the given number is Prime?
//We can write a simple program to divide the given number “n” from 2 to n/2 and check the remainder. 
//If the remainder is 0, then it’s not a prime number.
public class Test07 {
	public static void main(String[] args) {
		System.out.println(checkPrimeNumber(4));
		System.out.println(checkPrimeNumber(5));
		System.out.println(checkPrimeNumber(6));
		System.out.println(checkPrimeNumber(7));
	}
	
	public static boolean checkPrimeNumber(int num) {
		if (num == 0 || num == 1) {
			return false;
		} else if (num == 2) {
			return true;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}

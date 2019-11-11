package com.predicate;
// Write a predicate to check whether the given integer is greater than 10 or not. 
public class B {
	public boolean test(Integer I) {
		if (I > 10) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new B().test(12));
	}
}

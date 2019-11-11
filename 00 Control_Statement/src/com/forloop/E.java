package com.forloop;
//CTE more than one initialization is not possible
public class E {
	public static void main(String[] args) {
		for (int i=0 /*,double d = 10.8*/; i < 5; i++) {
			System.out.println("******more than one initialization is not possible******");
		}
	}
}

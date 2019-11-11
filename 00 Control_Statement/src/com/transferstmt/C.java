package com.transferstmt;

public class C {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("I-->"+i);
			if(i==5){
				System.out.println("II->"+i);
				continue;
				//System.out.println("III->"+i);
				//Unreachable code
			}
		}
	}
}

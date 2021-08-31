package com.transferstmt;

public class D {
	public static void main(String[] args) {
		int x=1;
		for (int i = x; i < 10; i++) {
			boolean status =i!=5;
			System.out.println("i->"+i + "**i!=5**->"+status);
			if(i!=5){
				System.out.println("****");
			}
		}
	}
}

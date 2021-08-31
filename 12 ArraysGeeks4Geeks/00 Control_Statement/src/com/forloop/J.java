package com.forloop;

public class J {
	static boolean foo(char ch){
		System.out.println("CH->"+ch);
		return true;
	}
	public static void main(String[] args) {
		int i =0;
		for (foo('A');foo('B') && (i<2) ; foo('C')) {
			System.out.println("I->"+i);
			i++;
			foo('D');
			System.out.println("****************");
		}
	}
}

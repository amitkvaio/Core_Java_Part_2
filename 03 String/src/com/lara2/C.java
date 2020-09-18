package com.lara2;

public class C {
	public static void main(String[] args) {
		String s1 = "abcabcabc";
		// 012345678
		int i = s1.indexOf('a');// 0
		System.out.println(i);
		int j = s1.indexOf('a', 1);// 3
		System.out.println(j);
		int k = s1.indexOf('c');// 2
		System.out.println(k);
		int l = s1.indexOf('c', 6);// 8
		System.out.println(l);

	}
}
//int j = s1.indexOf('a',1);//3
//javac searching a is available at fist index or not if not then javac
//move the next character and looking for a character if it is find then
//gives the index of a .
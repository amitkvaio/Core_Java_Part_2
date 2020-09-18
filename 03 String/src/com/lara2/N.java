package com.lara2;

public class N {
	public static void main(String[] args) {
		String s1 = "abc xyz hello 123";
		String[] x = s1.split(" ");
		for (String str : x) {
			System.out.println(str);
		}
	}
}

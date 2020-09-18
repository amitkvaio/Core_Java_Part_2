package com.lara2;

public class K {
	public static void main(String[] args) {
		String s1 = "lara tech";
		// 012345678
		int i = s1.indexOf(" ");// 4
		String s2 = s1.substring(0, i);// 0,4
		String s3 = s1.substring(i + 1);// from the 5th character onward it takes second string
		System.out.println(s2);
		System.out.println(s3);
	}
}

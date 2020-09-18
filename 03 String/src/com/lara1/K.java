package com.lara1;

public class K {
	public static void main(String[] args) {
		String s1 = "null";// string
		String s2 = null;// default literal
		String s3 = s1 + null;// nullnull
		System.out.println(s3);
		String s4 = s2 + null;// nullnull
		System.out.println(s4);
		System.out.println(s3.equals(s4));
	}
}

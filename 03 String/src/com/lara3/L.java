package com.lara3;

public class L {
	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer();
		sf.append("hello1234");
		// 012345678
		System.out.println(sf);
		System.out.println(sf);
		sf.delete(2, 50);
		System.out.println(sf);
	}
}

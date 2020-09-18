package com.lara3;

public class F {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		int length = sb.length();
		System.out.println("length=" + length);
		System.out.println("capacity=" + sb.capacity());
	}
}
